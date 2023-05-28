'''1. Crie uma classe Pessoa que tenha as seguintes propriedades: nome, idade, altura
e peso. Adicione métodos para definir e obter essas propriedades.'''

class Pessoa:
    def __init__(self, nome, idade, altura, peso):
        self.nome = nome
        self.idade = idade
        self.altura = altura
        self.peso = peso

    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome
    
    def setIdade(self, idade):
        self.iadde = idade

    def getIdade(self):
        return self.idade
    
    def setAltura(self, altura):
        self.altura = altura

    def getAltura(self):
        return self.altura
    
    def setPeso(self, peso):
        self.peso  = peso

    def getPeso(self):
        return self.peso

'''2. Crie uma classe Aluno que herde da classe Pessoa e adicione uma propriedade
para armazenar o número de matrícula do aluno. Adicione métodos para definir
e obter essa propriedade.'''

class Aluno(Pessoa):
    def __init__(self, nome, idade, altura, peso, matricula):
        super().__init__(nome, idade, altura, peso)
        self.matricula = matricula

    def setMatricula(self, matricula):
        self.matricula = matricula

    def getMatricula(self):
        return self.matricula
    
    def alunos(self):
        print(f'Nome {self.getNome()}'
              f'\nIdade {self.getIdade()}'
              f'\nRA {self.getMatricula()}')
    
aluno = Aluno("allan sergio", 27, 1.75, 95.00, "00230578")
aluno.alunos()

'''3. Crie uma classe Professor que herde da classe Pessoa e adicione uma
propriedade para armazenar a área de especialização do professor. Adicione
métodos para definir e obter essa propriedade.'''

class Professor(Pessoa):
    def __init__(self, nome, idade, altura, peso, especializacao):
        super().__init__(nome, idade, altura, peso)
        self.especializacao = especializacao

    def setEspecializacao(self,especializacao):
        self.especializacao = especializacao

    def getEspecializacao(self):
        return self.especializacao
    
    def professor(self):
        print(f'Nome {self.getNome()}'
              f'\nIdade {self.getIdade()}'
              f'\nEspecializacao {self.getEspecializacao()}')
    
professor = Professor('joao choma', 35, 1.75, 95.70, 'POO')
professor.professor()


'''4. Crie uma classe Animal que tenha as seguintes propriedades: nome, tipo e idade.
Adicione métodos para definir e obter essas propriedades.'''

class Animal:
    def __init__(self, nome, tipo, idade):
        self.nome = nome
        self.tipo = tipo
        self.idade = idade

    def setNome(self, nome):
        self.nome = nome
     
    def getNome(self):
        return self.nome
    
    def setTipo(self, tipo):
        self.tipo = tipo

    def getTipo(self):
        return  self.tipo
    
    def setIdade(self, idade):
        self,idade = idade

    def getIdade(self):
        return self.idade      

'''5. Crie uma classe Cachorro que herde da classe Animal e adicione uma
propriedade para armazenar a raça do cachorro. Adicione métodos para definir
e obter essa propriedade.'''

class Cachorro(Animal):
    def __init__(self, nome, tipo, idade, raca):
        super().__init__(nome, tipo, idade)
        self.raca = raca

    def setRaca(self, raca):
        self.raca = raca

    def getRaca(self):
        return self.raca
    
dog = Cachorro('Luke', 'Pequeno porte', 3, 'Pouddle')
print(dog.getNome())
print(dog.getTipo())
print(dog.getRaca())

'''6. Crie uma classe Gato que herde da classe Animal e adicione uma propriedade
para armazenar a cor do pelo do gato. Adicione métodos para definir e obter
essa propriedade.'''

class Gato(Animal):
    def __init__(self, nome, tipo, idade, cor_pelo):
        super().__init__(nome, tipo, idade)
        self.cor_pelo = cor_pelo

    def setCorPelo(self, cor):
        self.cor_pelo = cor

    def getCorPelo(self):
        return self.cor_pelo
    
cat = Gato('bills', 'gato pelado', 4, '')
print(cat.getNome())
print(cat.getCorPelo())
print(cat.getIdade())

'''7. Crie uma classe FiguraGeometrica que tenha as propriedades: altura e largura.'''

class FiguraGeometrica:
    def __init__(self, altura, largura):
        self.altura = altura
        self.largura = largura


'''a. Crie uma classe Retângulo que tenha as seguintes propriedades. Adicione
métodos para calcular a área e o perímetro do retângulo.'''

class Retangulo(FiguraGeometrica):
    def area(self):
        return self.altura * self.largura

    def perimetro(self):
        return 2 * (self.altura + self.largura)
    
retangulo = Retangulo(15, 25)
print(retangulo.area())
print(retangulo.perimetro())

'''b. Crie uma classe Triangulo. Adicione métodos para calcular a área e o
perímetro do triangulo.'''

class Triangulo(FiguraGeometrica):
    def area(self):
        return (self.altura * self.largura) / 2

    def perimetro(self):
        # Nesse exemplo, assumimos que o triângulo é retângulo e que a hipotenusa é a largura.
        hipotenusa = (self.altura ** 2 + self.largura ** 2) ** 0.5
        return self.altura + self.largura + hipotenusa
    
triangulo = Triangulo(25, 30)
print(triangulo.area())
print(triangulo.perimetro())