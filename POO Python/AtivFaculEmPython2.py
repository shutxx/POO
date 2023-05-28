'''Atividades sobre associação'''

'''1. Crie uma classe Carro que possua uma associação com a classe Motor. A classe
Motor deve possuir os atributos potencia e cilindrada. Crie também um método
na classe Carro chamado acelerar que exibe a mensagem "Acelerando..." e um
método chamado desligar que exibe a mensagem "Desligando...".'''

print('classe carro/motor')

class Motor:
    def __init__(self, potencia, cilindrada):
        self.potencia = potencia
        self.cilindrada = cilindrada


class Carro:
    def __init__(self, motor):
        self.motor = motor

    def acelerar(self):
        print("Acelerando...")

    def desligar(self):
        print("Desligando...")

motor = Motor(potencia=150, cilindrada=2000)
carro = Carro(motor)

print(carro.motor.cilindrada)

carro.acelerar()
carro.desligar()

'''2. Crie uma classe Aluno que possua uma associação com a classe Disciplina. A
classe Disciplina deve possuir os atributos nome e cargaHoraria. Crie também
um método na classe Aluno chamado matricular que exibe a mensagem
"Matriculando aluno na disciplina...".'''

print('classe aluno/pessoa')

class Disciplina:
    def __init__(self, nome, cargaHoraria):
        self.nome = nome
        self.cargaHoraria = cargaHoraria

class Aluno:
    def __init__(self, diciplina):
        self.diciplina = diciplina

    def matricular(self):
        print(f'Matriculando aluno na disciplina {diciplina.nome}')

diciplina = Disciplina("POO", 45.00)
aluno = Aluno(diciplina)

print(aluno.diciplina.nome)

aluno.matricular()


'''3. Crie uma classe Pessoa que possua uma associação com a classe Telefone. A
classe Telefone deve possuir os atributos ddd e numero. Crie também um
método na classe Pessoa chamado ligar que recebe um parâmetro do tipo
Telefone e exibe a mensagem "Ligando para o número: ddd numero..."'''

print('class pessoa/telefone')

class Telefone:
    def __init__(self, ddd, numero):
        self.ddd = ddd
        self.numero = numero

class Pessoa:
    def __init__(self, telefone, nome):
        self.nome = nome
        self.telefone = telefone

    def ligar(self):
        print(f'Ligando para o número: {pessoa.nome} {telefone.ddd, telefone.numero}')

telefone = Telefone(44, 998125151)
pessoa = Pessoa(telefone, "allan")

pessoa.ligar()


'''4. Crie uma classe ContaBancaria que possua uma associação com a classe Cliente.
A classe Cliente deve possuir os atributos nome e cpf. Crie também um método
na classe ContaBancaria chamado sacar que recebe um parâmetro do tipo
double e exibe a mensagem "Sacando valor..."'''

print('class cliente/contabancaria')

class Cliente:
    def __init__(self, nome, cpf):
        self.nome = nome
        self.cpf = cpf

class ContaBancaria:
    def __init__(self, saldo, cliente):
        self.saldo = saldo
        self.cliente = cliente

    def sacar(self, valor): 
        self.saldo -= valor       
        print(f'Sacando valor 500 novo saldo {self.saldo}')

cliente = Cliente('Allan Sergio', '073.899.479-00')
conta = ContaBancaria(1500.00, cliente)
conta.sacar(500)

'''5. Crie uma classe Loja que possua uma associação com a classe Produto. A classe
Produto deve possuir os atributos nome e preco. Crie também um método na
classe Loja chamado vender que recebe um parâmetro do tipo Produto e exibe
a mensagem "Vendendo produto..."'''

print('class produto/loja')

class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

class Loja:
    def __init__(self, produto):
        self.produto = produto

    def Vender(self):
        print(f'Vendendo produto {produto.nome} valor {produto.preco}')

produto = Produto('teclado', 150.00)
loja = Loja(produto)

loja.Vender()

