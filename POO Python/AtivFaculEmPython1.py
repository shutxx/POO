'''Atividades Classe e encapsulamento.'''

'''1. Crie uma classe chamada Pessoa com os atributos nome e idade. Crie métodos
para definir e obter os valores desses atributos. Crie um objeto do tipo Pessoa e
exiba seus valores.'''

print('class Pesooa')

class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def setNome(self, nome):
        self.nome = nome
        
    def setIdade(self, idade):
        self.idade = idade
    
    def getNome(self):
        return self.nome
    
    def getIdade(self):
        return self.idade

pessoa1 = Pessoa("João", 25)
print("Nome: " + pessoa1.getNome())
print("Idade: " + str(pessoa1.getIdade()))


'''2. Crie uma classe chamada Carro com os atributos marca, modelo e ano. Crie
métodos para definir e obter os valores desses atributos. Crie um objeto do tipo
Carro e exiba seus valores.'''

print('class Carro')

class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
    
    def setMarca(self, marca):
        self.marca = marca
    
    def getMarca(self):
        return self.marca
    
    def setModelo(self, modelo):
        self.modelo = modelo

    def getModelo(self):
        return self.modelo
    
    def setAno(self, ano):
        self.ano = ano

    def getAno(self):
        return self.ano
    
carro = Carro("wolksvagem", "gol", 1995)
print(carro.getMarca())
print(carro.getAno())


'''3. Crie uma classe chamada ContaBancaria com os atributos numero, saldo e
titular. Crie métodos para definir e obter os valores desses atributos, bem como
para depositar e sacar dinheiro da conta. Crie um objeto do tipo ContaBancaria
e realize algumas operações de depósito e saque.'''

print('class CantaBancaria')

class ContaBancaria:
    def __init__(self, numero, saldo, titular):
        self.numero = numero
        self.saldo = saldo
        self.titular = titular

    def setNumero(self, numero):
        self.numero = numero

    def setSaldo(self, saldo):
        self.saldo = saldo
    
    def setTitular(self, titular):
        self.titular = titular

    def getNumero(self):
        return self.numero
    
    def getSaldo(self):
        return self.saldo
    
    def getTitular(self):
        return self.titular
    
    def Deposito(self, deposito):
        self.saldo += deposito

    def Saque(self, saque):
        self.saldo -= saque

    
conta = ContaBancaria("2533345", 500.00, "Allan Sergio")
print(conta.getTitular())
print(conta.getSaldo())
print('Deposito de 500.00')
conta.Deposito(500.00)
print(conta.getSaldo())
print('Saque de 250.00')
conta.Saque(250.00)
print(conta.getSaldo())


'''4. Crie uma classe chamada Retangulo com os atributos largura e altura. Crie
métodos para definir e obter os valores desses atributos, bem como para calcular
a área e o perímetro do retângulo. Crie um objeto do tipo Retangulo e exiba seus
valores, área e perímetro.'''

print('class Retangulo')

class Retangulo:
    def __init__(self, lagura, altura):
        self.largura = lagura
        self.altura = altura
    
    def setLargura(self , largura):
        self.largura = largura
    
    def setAltura(self, altura):
        self.altura = altura

    def getLargura(self):
        return self.largura
    
    def getAltura(self):
        return self.altura
    
    def calArea(self):
        return self.altura * self.largura
    
    def calPerimetro(self):
        return 2 * (self.altura + self.largura)
    
calculo = Retangulo(15, 20)

print(calculo.calArea())
print(calculo.calPerimetro())


'''5. Crie uma classe chamada Animal com os atributos nome e especie. Crie métodos
para definir e obter os valores desses atributos, bem como para emitir um som
característico do animal. Crie duas subclasses de Animal, uma chamada Cachorro
e outra chamada Gato, e sobrescreva o método de emitir som para cada uma
dessas subclasses. Crie objetos do tipo Cachorro e Gato e exiba seus sons
característicos.'''

print('class Animal subclass gato, cachorro')

class Animal:
    def __init__(self, nome, especie):
        self.nome = nome
        self.especie = especie
        
    def get_nome(self):
        return self.nome
    
    def set_nome(self, nome):
        self.nome = nome
        
    def get_especie(self):
        return self.especie
    
    def set_especie(self, especie):
        self.especie = especie
        
    def emitir_som(self):
        return("O animal está emitindo um som.")
        

class Cachorro(Animal):
    def emitir_som(self):
        return("Au au!")
        

class Gato(Animal):
    def emitir_som(self):
        return("Miau!")

animal = Cachorro("Luke", "Poodle")
print(animal.get_especie())
print(animal.get_nome())
print(animal.emitir_som())

'''6. Crie uma classe chamada Funcionario com os atributos nome, salario e
departamento. Crie métodos para definir e obter os valores desses atributos,
bem como para calcular o imposto a ser pago pelo funcionário (10% do salário).
Crie um objeto do tipo Funcionario e exiba seu nome, salário, departamento e
imposto a ser pago.'''

print('class Funcionario')

class Funcionario:
    def __init__(self, nome, salario, departamento):
        self.nome = nome
        self.salario = salario
        self.departamento = departamento

    def setNome(self, nome):
        self.nome = nome
    
    def setSalario(self, salario):
        self.salario = salario

    def setDepartamento(self, departamento):
        self.departamento = departamento

    def getNome(self):
        return self.nome
    
    def getSalario(self):
        return (f'Salario {self.salario}')
    
    def getDepartamento(self):
        return (f'Departamento {self.departamento}')
    
    def Desconto(self):
        desconto = (self.salario * 10) / 100
        salarioLiquido = self.salario - desconto
        return (f'Desconto total {desconto}\nSalario liquido {salarioLiquido}')

funcionario = Funcionario("Allan Sergio", 1500.00, "mecanico")
print(funcionario.getNome())
print(funcionario.getSalario())
print(funcionario.getDepartamento())
print(funcionario.Desconto())


'''7. Crie uma classe chamada Livro com os atributos titulo, autor e ano. Crie métodos
para definir e obter os valores desses atributos, bem como para exibir uma
mensagem informando os detalhes do livro. Crie um objeto do tipo Livro e exiba
suas informações.'''

print('class Livro')

class Livro:
    def __init__(self, titulo, autor, ano):
        self.titulo = titulo
        self.autor = autor
        self.ano = ano

    def setTitulo(self, titulo):
        self.titulo = titulo

    def setAuto(self, autor):
        self.autor = autor
    
    def setAno(self, ano):
        self.ano = ano

    def getTtulo(self):
        return self.titulo
    
    def getAutor(self):
        return self.autor
    
    def getAno(self):
        return self.ano
    
    def msg():
        return (f'The standard chunk of Lorem Ipsum used since the 1500s is reproduced below'
                'for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum"')
    
livro = Livro("lorem ipsum", "allan", 2023)
print(livro.getTtulo())
print(Livro.msg())


'''8. Crie uma classe chamada Ponto com os atributos x e y. Crie métodos para definir
e obter os valores desses atributos, bem como para calcular a distância entre
dois pontos. Crie dois objetos do tipo Ponto e calcule a distância entre eles.'''

print('class Ponto')

import math

class Ponto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def set_x(self, x):
        self.x = x

    def set_y(self, y):
        self.y = y
    
    def get_x(self):
        return self.x
    
    def get_y(self):
        return self.y
    
    def distancia(self, outro_ponto):
        dx = self.x - outro_ponto.get_x()
        dy = self.y - outro_ponto.get_y()
        return math.sqrt(dx*dx + dy*dy)

ponto1 = Ponto(0, 0)
ponto2 = Ponto(3, 4)
distancia = ponto1.distancia(ponto2)
print(distancia)