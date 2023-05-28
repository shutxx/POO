'''1. Crie uma classe abstrata chamada `Conta` com os métodos abstratos `saque(double
valor)` e `deposito(double valor)`. Implemente duas classes que herdam de `Conta`:
`ContaCorrente` e `ContaPoupanca`. Ambas devem implementar os métodos abstratos
de `Conta`. Na classe `ContaCorrente`, caso o saldo fique negativo após um saque, lance
uma exceção `SaldoInsuficienteException`. Na classe `ContaPoupanca`, caso o valor do
depósito seja menor do que 100 reais, lance uma exceção `DepositoMinimoException`.'''

from abc import ABC, abstractmethod

class Conta(ABC):
    def __init__(self, saldo):
        self.saldo = saldo

    @abstractmethod
    def saque(self, valor):
        pass

    @abstractmethod
    def deposito(self, valor):
        pass

class ContaCorrente(Conta):
    def saque(self, valor):
        if self.saldo - valor < 0:
            raise SaldoInsuficienteException("Saldo insuficiente para realizar saque.")
        else:
            self.saldo -= valor

    def deposito(self, valor):
        self.saldo += valor

class ContaPoupanca(Conta):
    def saque(self, valor):
        if self.saldo - valor < 0:
            raise SaldoInsuficienteException("Saldo insuficiente para realizar saque.")
        else:
            self.saldo -= valor

    def deposito(self, valor):
        if valor < 100:
            raise DepositoMinimoException("Depósito mínimo é de R$ 100.")
        else:
            self.saldo += valor

class SaldoInsuficienteException(Exception):
    pass

class DepositoMinimoException(Exception):
    pass

saque = ContaCorrente(1500)
saque.saque(500)

'''2. Crie uma classe `Calculadora` que tenha um método `divisao(double a, double b)`.
Caso o divisor (`b`) seja igual a zero, lance uma exceção `DivisaoPorZeroException`.'''

class Calculadora:
    def __init__(self, n1, n2):
        self.n1 = n1
        self.n2 = n2

    def divisao(self):
        if self.n1 == 0:
            raise DivisaoPorZero("Divisao Por zero")
        elif self.n2 == 0:
            raise DivisaoPorZero("Divisao Por zero")
        else:
            return self.n1 / self.n2
 
class DivisaoPorZero(Exception):
    pass

num = Calculadora(5, 2)
print(num.divisao())


'''3. Crie uma classe abstrata chamada `Animal` com o método abstrato `emitirSom()`.
Implemente duas classes que herdam de `Animal`: `Cachorro` e `Gato`. Na classe
`Cachorro`, o método `emitirSom()` deve imprimir "Au au!". Na classe `Gato`, o método
`emitirSom()` deve imprimir "Miau!".'''

from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def emitirSom(self):
        pass

class Cachorro(Animal):
    def emitirSom(self):
        print("Au au!")

class Gato(Animal):
    def emitirSom(self):
        print("Miau!")

cachorro = Cachorro()
cachorro.emitirSom()

gato = Gato()
gato.emitirSom()

'''4. Crie uma classe `Lampada` que tenha um método `ligar()` e um método `desligar()`.
Caso a lâmpada já esteja ligada e o método `ligar()` seja chamado, lance uma exceção
`LampadaJaLigadaException`. Caso a lâmpada já esteja desligada e o método `desligar()`
seja chamado, lance uma exceção `LampadaJaDesligadaException`.'''

class Lampada:
    def __init__(self):
        self.esta_ligada = False

    def ligar(self):
        if self.esta_ligada:
            raise LampadaJaLigadaException("A lâmpada já está ligada.")
        self.esta_ligada = True
        print(self.esta_ligada)
        print("Lâmpada ligada.")

    def desligar(self):
        if not self.esta_ligada:
            raise LampadaJaDesligadaException("A lâmpada já está desligada.")
        self.esta_ligada = False
        print(self.esta_ligada)
        print("Lâmpada desligada.")

class LampadaJaLigadaException(Exception):
    pass

class LampadaJaDesligadaException(Exception):
    pass

lampada = Lampada()

lampada.ligar()  
lampada.desligar() 

lampada.ligar()  
lampada.desligar() 


'''5. Crie uma classe `ValidadorCPF` que tenha um método `validar(String cpf)`. Caso o CPF
não tenha exatamente 11 dígitos, lance uma exceção `CpfInvalidoException`. Caso o CPF
não seja válido (de acordo com a fórmula de validação), lance uma exceção
`CpfInvalidoException`.'''

class ValidadorCPF:
    def __init__(self, cpf):
        self.cpf = cpf

    def validar(self):
        if len(self.cpf) != 11:
            raise CpfInvalidoException("CPF deve ter exatamente 11 dígitos")

        if not self.validar_digitos():
            raise CpfInvalidoException("CPF inválido")
        
    def validar_digitos(self):
        numeros = [int(n) for n in self.cpf]
        print(numeros)

        if len(numeros) != 11:
            return False

        soma = sum(numeros[i] * (10 - i) for i in range(9))
        digito1 = 11 - (soma % 11)
        if digito1 >= 10:
            digito1 = 0

        if numeros[9] != digito1:
            return False

        soma = sum(numeros[i] * (11 - i) for i in range(10))
        digito2 = 11 - (soma % 11)
        if digito2 >= 10:
            digito2 = 0

        return numeros[10] == digito2

class CpfInvalidoException(Exception):
    pass

cpfSujo = '073,899,479-00'
print(cpfSujo)
cpfLinpo = ''.join(filter(str.isdigit, cpfSujo))
print(cpfLinpo)

cpf = ValidadorCPF(cpfLinpo)
cpf.validar()
cpf.validar_digitos()