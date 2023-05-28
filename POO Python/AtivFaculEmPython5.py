'''1. Explique o conceito de polimorfismo em POO e como ele pode ser aplicado em
diferentes situações.'''

'''2. Escreva uma classe Animal com um método fazerSom(). Crie duas subclasses
dessa classe chamadas Cachorro e Gato que redefinem o método fazerSom()
para que o cachorro emita o som "au au" e o gato emita o som "miau". Utilize o
polimorfismo para chamar o método fazerSom() a partir de uma variável do
tipo Animal.'''

class Animal:
    def fazerSom(self):
        print("Som generico")

class Cachorro(Animal):
    def fazerSom(self):
        print("au au")

class Gato(Animal):
    def fazerSom(self):
        print("miau")

animal0 = Animal()
animal1 = Cachorro()
animal2 = Gato()

lista_animais = [animal0, animal1, animal2]

for animal in lista_animais:
    animal.fazerSom()

'''3. Crie uma interface Desenhar com um método desenhar(). Implemente essa
interface nas classes Circulo, Retangulo e Triangulo. Cada classe deve
implementar o método desenhar() de forma diferente, desenhando o seu
respectivo objeto de forma adequada. Utilize o polimorfismo para chamar o
método desenhar() a partir de uma variável do tipo Desenhar.'''

class Desenhar:
    def desenhar(self):
        print('desenhando')

class Circulo:
    def desenhar(self):
        print('desenhando circulo')

class Retangulo:
    def desenhar(self):
        print('desenhando retangulo')

class Triangulo:
    def desenhar(self):
        print('desenhando triandulo')

desenhar1 = Circulo()
desenhar2 = Retangulo()
desenhar3 = Triangulo()

lista_desenhos = [desenhar1, desenhar2, desenhar3]

for desenho in lista_desenhos:
    desenho.desenhar()

'''4. Escreva uma classe Veiculo com um método acelerar(). Crie duas subclasses
dessa classe chamadas Carro e Moto que implementam o método acelerar()
de forma diferente, aumentando a velocidade do veículo em uma determinada
quantidade. Utilize o polimorfismo para chamar o método acelerar() a partir
de uma variável do tipo Veiculo.'''

class Veiculo:
    def acelerar(self):
        pass

class Carro(Veiculo):
    def acelerar(self):
        print("Acelerando o carro em 10 km/h")

class Moto(Veiculo):
    def acelerar(self):
        print("Acelerando a moto em 20 km/h")

veiculo1 = Carro()
veiculo2 = Moto()

veiculos_acelerar = [veiculo1, veiculo2]

for veiculo in veiculos_acelerar:
    veiculo.acelerar()

'''5. Crie uma classe Funcionario com um método calcularSalario() que
retorna o salário base do funcionário. Crie duas subclasses dessa classe
chamadas Gerente e Operador que redefinem o método calcularSalario()
para calcular o salário de acordo com as suas respectivas regras de cálculo. Utilize
o polimorfismo para chamar o método calcularSalario() a partir de uma
variável do tipo Funcionario.'''

class Funcionario:
    def __init__(self, salario_base):
        self.salario_base = salario_base
    
    def calcularSalario(self):
        return self.salario_base


class Gerente(Funcionario):
    def __init__(self, salario_base, bonus):
        super().__init__(salario_base)
        self.bonus = bonus
    
    def calcularSalario(self):
        return self.salario_base + self.bonus


class Operador(Funcionario):
    def __init__(self, salario_base, horas_extras):
        super().__init__(salario_base)
        self.horas_extras = horas_extras
    
    def calcularSalario(self):
        return self.salario_base + self.horas_extras * 10

funcionarios = [
    Funcionario(2000),
    Gerente(3000, 1000),
    Operador(1500, 20)
]

for funcionario in funcionarios:
    print(funcionario.calcularSalario())


'''6. Crie uma classe FormaGeometrica com um método calcularArea() que
retorna a área da forma geométrica. Crie duas subclasses dessa classe chamadas
Quadrado e Circulo que implementam o método calcularArea() de forma
diferente, calculando a área do quadrado e do círculo, respectivamente. Utilize
o polimorfismo para chamar o método calcularArea() a partir de uma
variável do tipo FormaGeometrica.'''

import math

class FormaGeometrica:
    def calcularArea(self):
        pass


class Quadrado(FormaGeometrica):
    def __init__(self, lado):
        self.lado = lado
    
    def calcularArea(self):
        return self.lado ** 2


class Circulo(FormaGeometrica):
    def __init__(self, raio):
        self.raio = raio
    
    def calcularArea(self):
        return math.pi * self.raio ** 2

formas = [
    Quadrado(5),
    Circulo(2),
    Quadrado(3),
    Circulo(4)
]

for forma in formas:
    print(forma.calcularArea())


'''7. Crie uma classe Animal com um método locomover() que retorna a forma
como o animal se locomove. Crie duas subclasses dessa classe chamadas Peixe
e Ave que redefinem o método locomover() para que o peixe retorne
"nadando" e a ave retorne "voando". Utilize o polimorfismo para chamar o
método locomover() a partir de uma variável do tipo Animal.'''

class Animal:
    def locomover(self):
        pass


class Peixe(Animal):
    def locomover(self):
        return "nadando"


class Ave(Animal):
    def locomover(self):
        return "voando"

animais = [
    Animal(),
    Peixe(),
    Ave()
]

for animal in animais:
    print(animal.locomover())
