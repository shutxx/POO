'''Criar classes de modelo, com no mínimo 05 atributos:'''
'''Produto'''
class Produto:
#================================================= construtor
    def __init__(self, idProduto, nomeProduto, estoqueProduto, preco, marca):
        self.idProduto = idProduto
        self.nomeProduto = nomeProduto
        self.estoqueProduto = estoqueProduto
        self.preco = preco
        self.marca = marca

#================================================= get e sets idProduto
    def setIdProduto(self, idProduto):
        self.idProduto = idProduto

    def getIdProduto(self):
        return self.idProduto

#================================================= get e sets nomeProduto
    def setNomeProduto(self, nomeProduto):
        self.nomeProduto = nomeProduto
    
    def getNomeProduto(self):
        return self.nomeProduto
    
#================================================= get e sets estoqueProduto
    def setEstoqueProduto(self, estoqueProduto):
        self.estoqueProduto = estoqueProduto

    def getEstoqueProduto(self):
        return self.estoqueProduto
    
#================================================= get e sets Preco
    def setPreco(self, preco):
        self.preco = preco

    def getPreco(self):
        return self.preco
    
#================================================= get e sets marca
    def setMarca(self, marca):
        self.marca = marca
    
    def getMarca(self):
        return self.marca
       
'''Cliente'''
class Cliente:
#================================================= construtor 
    def __init__(self, idCliente, nome, idade, cpf, sexo):
        self.idCliente = idCliente
        self.nome = nome
        self.idade = idade
        self.cpf = cpf
        self.sexo = sexo

#================================================= get e sets idCliente
    def setIdCliente(self, idCliente):
        self.idCliente = idCliente

    def getIdCliente(self):
        return self.idCliente

#================================================= get e sets nome
    def setNome(self, nome):
        self.nome = nome

    def getNome(self):
        return self.nome

#================================================= get e sets idade
    def setIdade(self, idade):
        self.idade = idade

    def getIdade(self):
        return self.idade

#================================================= get e sets cpf
    def setCpf(self, cpf):
        self.cpf = cpf

    def getCpf(self):
        return self.cpf

#================================================= get e sets sexo
    def setSexo(self, sexo):
        self.sexo = sexo
    
    def getSexo(self):
        return self.sexo

'''Venda'''
class Venda(Produto):
#================================================= construtor 
    def __init__(self, idVenda, data, qtde, cliente, produto):
        self.idVenda = idVenda
        self.data = data
        self.qtde = qtde
        self.cliente = cliente
        self.produto = produto

#================================================= get e sets idVenda
    def setIdVenda(self, idVenda):
        self.idVenda = idVenda

    def getIdVenda(self):
        return self.idVenda

#================================================= get e sets data
    def setData(self, data):
        self.data = data

    def getData(self):
        return self.data

#================================================= get e sets qtde
    def setQtde(self, qtde):
        self.qtde = qtde

    def getQtde(self):
        return self.qtde

#================================================= get e sets preco  
    def SetPreco(self, preco):
        self.preco = preco

    def getPreco(self):
        return self.produto.getPreco() * self.qtde
    
#================================================= get e sets cliente
    def setCliente(self, cliente):
        self.cliente = cliente
    
    def getCliente(self):
        return self.cliente
    
#================================================= get e sets produto
    def setProduto(self, produto):
        self.produto = produto

    def getProduto(self):
        return self.produto

'''Criar classes de controle DAO, cada classe Dao deve conter métodos:'''
'''ProdutoDao'''
class ProdutoDao:
#================================================= construtor 
    def __init__(self):
        self.produtos = []

#================================================= adicionar
    def adicionar(self, produto: Produto):
        self.produtos.append(produto)

#================================================= remover
    def remover(self, id,):
        itenRemover = False
        for produto in self.produtos:
            if produto.idProduto == id:
                itenRemover = produto
                break
        self.produtos.remove(itenRemover)

#================================================= buscar
    def consultarProduto(self, id):
        for produto in self.produtos:
            if produto.idProduto == id:
                print(produto.idProduto, 
                      produto.nomeProduto, 
                      produto.estoqueProduto, 
                      produto.preco, 
                      produto.marca)
                break
            else:
                print('Produto nao encontrado...')

#================================================= atualizar
    def atualizar(self, id, p : Produto):
        for produto in self.produtos:
            if produto.idProduto == id:
                produto.setNomeProduto(p.getNomeProduto())
                produto.setEstoqueProduto(p.getEstoqueProduto())
                produto.setPreco(p.getPreco())
                produto.setMarca(p.getMarca())
                break

#================================================= listar
    def listarProdutos(self):
        for produto in self.produtos:
            print(produto.idProduto, 
                    produto.nomeProduto, 
                    produto.estoqueProduto, 
                    produto.preco, 
                    produto.marca)

gerenciadorProduto = ProdutoDao()

prod1 = Produto(1, 'teclado', 5, 150.00, 'razer')
prod2 = Produto(2, 'mouse', 5, 130.00, 'redragon')

print('Adicionado e listando produtos')
gerenciadorProduto.adicionar(prod1)
gerenciadorProduto.adicionar(prod2)
gerenciadorProduto.listarProdutos()
print()
print('Atualizado e listando produto')
prod3 = Produto(2, 'mouse', 5, 150.00, 'redragon')
gerenciadorProduto.atualizar(2, prod3)
gerenciadorProduto.listarProdutos()
print()
print('Removendo e listando produtos')
gerenciadorProduto.remover(2)
gerenciadorProduto.listarProdutos()

print('Clientes')
class ClienteDao:
#================================================= construtor 
    def __init__(self):
        self.clientes = []

#================================================= adicionar
    def adicionar(self, cliente : Cliente):
        self.clientes.append(cliente)

#================================================= remover
    def remover(self, id):
        clienteRemover = False
        for cliente in self.clientes:
            if cliente.idCliente == id:
                clienteRemover = cliente
        self.clientes.remove(clienteRemover)
        
#================================================= buscar
    def consultarCliente(self, id):
        for cliente in self.clientes:
            if cliente.idCliente == id:
                print(cliente.idCliente, 
                      cliente.nome, 
                      cliente.idade, 
                      cliente.cpf, 
                      cliente.sexo)
                break
            else:
                print('Cliente nao encontrado...')

#================================================= atualizar
    def atualizar(self, id, c : Cliente):
        for cliente in self.clientes:
            if cliente.idCliente == id:
                cliente.setNome(c.getNome())
                cliente.setIdade(c.getIdade())
                cliente.setCpf(c.getCpf())
                cliente.setSexo(c.getSexo())
                break

#================================================= listar
    def listarClientes(self):
        for cliente in self.clientes:
            print(cliente.idCliente, 
                    cliente.nome, 
                    cliente.idade, 
                    cliente.cpf, 
                    cliente.sexo)        

gerenciadorCliente = ClienteDao()

cliente1 = Cliente(1, 'allan sergio', 27, '037.899.479-00', 'M')
cliente2 = Cliente(2, 'eduarda larissa', 24, '037.899.479-00', 'F')

print('Adicionar e listar clientes')
gerenciadorCliente.adicionar(cliente1)
gerenciadorCliente.adicionar(cliente2)
gerenciadorCliente.listarClientes()


gerenciadorCliente.consultarCliente(1)
gerenciadorCliente.remover(1)

gerenciadorCliente.listarClientes()

cliente2 = Cliente(2, 'eduarda larissa torres', 24, '000.000.000-00', 'F')
gerenciadorCliente.atualizar(2, cliente2)

gerenciadorCliente.listarClientes()

print('============Venda============')
class VendaDao:
#================================================= construtor 
    def __init__(self):
        self.vendas = []

#================================================= adicionar
    def adicionar(self, venda : Venda):
        self.vendas.append(venda)

#================================================= remover
    def remover(self, id):
        vendaRemover = False
        for venda in self.vendas:
            if venda.idVenda == id:
                vendaRemover = venda
        self.vendas.remove(vendaRemover)

#================================================= buscar
    def consultarVenda(self, id):
        for venda in self.vendas:
            if venda.idVenda == id:
                print()
                break
            else:
                print('Venda nao encontrado...')

#================================================= atualizar
    def atualizar(self, id, v: Venda):
        for venda in self.vendas:
            if venda.idVenda == id:
                venda.setData(v.getData())
                venda.setQtde(v.getQtde())
                venda.setPreco(v.getPreco())
                venda.setCliente(v.getCliente())
                venda.setProduto(v.getProduto())
                break

#================================================= listar
    def listarVendar(self):
        for venda in self.vendas:
            print(f'id: {venda.idVenda}' 
                  f'\ndata: {venda.data} '
                  f'\nCliente: {venda.cliente.getNome()}'
                  f'\nProduto: {venda.produto.getNomeProduto()}'
                  f'\nQuantidaded: {venda.qtde}'
                  f'\nValor total: {venda.getPreco()}')


gerencidorVendas = VendaDao()

print('Criando e imprimindo as vendas')
venda1 = Venda(1, '21/05/23', 2, cliente1, prod2)
venda2 = Venda(2, '20/05/23', 1, cliente2, prod1)
gerencidorVendas.adicionar(venda1)
gerencidorVendas.adicionar(venda2)
gerencidorVendas.listarVendar()

print('Removendo e imprimindo novo resultado')
gerencidorVendas.remover(1)
gerencidorVendas.listarVendar()

print('Consultando venda')
gerencidorVendas.consultarVenda(2)

print('Atualizando e imprimendo venda')
venda2 = Venda(1, '25/21/21', 3, cliente1, prod1)
gerencidorVendas.atualizar(2, venda2)
gerencidorVendas.listarVendar()