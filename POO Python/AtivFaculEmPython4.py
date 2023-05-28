'''1. Sistema de controle de estoque: crie uma classe Produto com os atributos
nome, preço e quantidade. Em seguida, crie uma classe Estoque que
contém uma lista de objetos da classe Produto e métodos para adicionar,
remover e consultar produtos no estoque.'''

class Produtos:
    def __init__(self, nome, preco, quantidade):
        self.nome = nome
        self.preco = preco
        self.quantidade = quantidade

class Estoque:
    def __init__(self):
        self.produtos = []

    def adicionar_produto(self, produto: Produtos):
        self.produtos.append(produto)

    def remover_produto(self, produto: Produtos):
        if produto in self.produtos:
            self.produtos.remove(produto)
            print(f"Rmovendo {produto.nome}")
        else:
            print("Produto não encontrado.")

    def consultar_produto(self, produto: Produtos):
        if produto in self.produtos:
            print(produto.nome, produto.preco)
        else:
            print('Produto nao encontrado')

    def listar(self):
        print('Lista  Produtos')
        for produto in self.produtos:
            print(produto.nome, produto.preco)


estoque = Estoque()

prod1 = Produtos('Teclado', 150.55, 5)
prod2 = Produtos('Camisa', 150.55, 5)
prod3 = Produtos('Mouse', 350.55, 5)
prod4 = Produtos('Monitor', 1500.55, 5)

estoque.adicionar_produto(prod1)
estoque.adicionar_produto(prod2)
estoque.adicionar_produto(prod3)
estoque.adicionar_produto(prod4)
estoque.listar()
estoque.remover_produto(prod1)
estoque.listar()
estoque.consultar_produto(prod4)

print('==========================================')
'''2. Sistema de cadastro de clientes: crie uma classe Cliente com os atributos
nome, endereço e telefone. Em seguida, crie uma classe
CadastroClientes que contém uma lista de objetos da classe Cliente e
métodos para adicionar, remover e consultar clientes no cadastro.'''

class Clientes:
    def __init__(self, nome, endereco, telefone):
        self.nome = nome
        self.endereco = endereco
        self.telefone = telefone

class CadastroClientes:
    def __init__(self):
        self.clientes = []

    def adicionar_cliente(self, cliente: Clientes):
        self.clientes.append(cliente)

    def remover_cliente(self, cliente: Clientes):
        if cliente in self.clientes:
            self.clientes.remove(cliente)
            print(f'Removendo {cliente.nome}')
        else:
            print('Cliente nao encontrado')

    def  consultar_cliente(self, cliente: Clientes):
        if cliente in self.clientes:
            print(cliente.nome, cliente.telefone)
        else:
            print('Cliente nao encontrado')
        
    def listar_clientes(self):
        print('Lista de Clientes')
        for cliente in self.clientes:
            print(cliente.nome, cliente.telefone)

cadastro = CadastroClientes()

cliente1 = Clientes('Allan Sergio', 'Rua: Belo Horizonte', '44998125151')
cliente2 = Clientes('Eduada Torres', 'Rua: Belo Horizonte', '4499999999')
cliente3 = Clientes('Henrique Torres', 'Rua: Belo Horizonte', '446666666')

cadastro.adicionar_cliente(cliente1)
cadastro.adicionar_cliente(cliente2)
cadastro.adicionar_cliente(cliente3)
cadastro.listar_clientes()
cadastro.remover_cliente(cliente2)
cadastro.listar_clientes()
cadastro.consultar_cliente(cliente2)

print('==========================================')
'''3. Sistema de vendas: crie uma classe Produto com os atributos nome,
preço e quantidade. Em seguida, crie uma classe CarrinhoCompras que
contém uma lista de objetos da classe Produto e métodos para adicionar,
remover e calcular o valor total da compra.'''

class Produto:
    def __init__(self, nome, preco, quantidade):
        self.nome = nome
        self.preco = preco
        self.quantidade = quantidade

class CarrinhoCompras:
    def __init__(self):
        self.carinho = []
    
    def adicionar(self, produto: Produto):
        self.carinho.append(produto)

    def remover(self, produto: Produto):
        if produto in self.carinho:
            self.carinho.remove(produto)
            print(f'Removendo {produto.nome}')
        else:
            print('Cliente nao encontrado')

    def listar_carinho(self):
        print('Carrinho')
        for produto in self.carinho:
            print(produto.nome, produto.preco)

    def total(self):
        total = 0
        totprod = 0
        for produto in self.carinho:
            totprod += produto.quantidade
            total += produto.preco
        print(f'Quantidade de itens: {totprod}\nvalor total:{total * totprod}')

carrinho = CarrinhoCompras()

carrinho.adicionar(prod1)
carrinho.adicionar(prod2)
carrinho.adicionar(prod3)
carrinho.adicionar(prod4)

carrinho.listar_carinho()
carrinho.remover(prod3)
carrinho.listar_carinho()
carrinho.total()

print('==========================================')
'''4. Sistema de gerenciamento de contas bancárias: crie uma classe
ContaBancaria com os atributos titular, saldo e número. Em seguida, crie
uma classe GerenciadorContas que contém uma lista de objetos da
classe ContaBancaria e métodos para adicionar, remover e consultar
contas bancárias.'''

class ContaBancaria:
    def __init__(self, titular, saldo, numero):
        self.titular = titular
        self.saldo = saldo
        self.numero = numero

class GerenciadorContas:
    def __init__(self):
        self.contas = []

    def adicionar(self, conta: ContaBancaria):
        self.contas.append(conta)

    def remover(self, conta: ContaBancaria):
        self.contas.remove(conta)

    def listar_contas(self):
        print('Contas')
        for conta in self.contas:
            print(conta.titular, conta.numero)

    def  consultar_conta(self, numero):
        for conta in self.contas:
            if conta.numero == numero:
                print(conta.titular, conta.numero)
                break
            else:
                print('Conta nao encontrado')

gerenciador = GerenciadorContas()

conta1 = ContaBancaria('Allan', 2500.00, 22500)
conta2 = ContaBancaria('Eduarda', 1500.00, 23566)
conta3 = ContaBancaria('Henrique', 300.00, 15065)

gerenciador.adicionar(conta1)
gerenciador.adicionar(conta2)
gerenciador.adicionar(conta3)
gerenciador.listar_contas()
gerenciador.remover(conta2)
gerenciador.listar_contas()
gerenciador.consultar_conta(22500)

print('==========================================')
'''5. Sistema de gerenciamento de tarefas: crie uma classe Tarefa com os
atributos descrição, data e prioridade. Em seguida, crie uma classe
GerenciadorTarefas que contém uma lista de objetos da classe Tarefa e
métodos para adicionar, remover e listar tarefas com base em sua data e
prioridade.'''

class Tarefa:
    def __init__(self, descricao, data, prioridade):
        self.descricao = descricao
        self.data = data
        self.prioridade = prioridade

class GerenciadorTarefas:
    def __init__(self):
        self.tarefas = []

    def adicionar(self, tarefa: Tarefa):
        self.tarefas.append(tarefa)

    def remover(self, tarefa: Tarefa):
        if tarefa in self.tarefas:
            self.tarefas.remove(tarefa)
        else:
            print('Tarefa nao encontrada')

    def listar_data(self):
        tarefas_ordenadas = sorted(self.tarefas, key=lambda tarefa: tarefa.data)
        print('LISTA DE TAREFAS POR DATA')
        for tarefa in tarefas_ordenadas:
            print(tarefa.descricao, tarefa.data)

    def listar_prioridade(self):
        tarefas_ordenadas = sorted(self.tarefas, key=lambda tarefa: tarefa.prioridade)
        print('LISTA DE POR PRIORIDADE')
        for tarefa in tarefas_ordenadas:
            print(tarefa.descricao, tarefa.prioridade)

gerenciador = GerenciadorTarefas()

tarefa1 = Tarefa('Estudar Python', '26/05/2023', 5)
tarefa2 = Tarefa('Estudar POO', '20/05/2023', 3)
tarefa3 = Tarefa('Estudar BD', '23/05/2023', 1)

gerenciador.adicionar(tarefa1)
gerenciador.adicionar(tarefa2)
gerenciador.adicionar(tarefa3)
gerenciador.listar_data()
gerenciador.remover(tarefa2)
gerenciador.listar_data()
gerenciador.listar_prioridade()

        