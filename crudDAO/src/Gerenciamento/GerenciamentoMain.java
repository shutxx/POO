package Gerenciamento;

import Classes.ProdutoClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author shuttxx
 */
public class GerenciamentoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAO.ClienteClassDAO cliente = new DAO.ClienteClassDAO();
        
        DAO.ProdutoClassDAO prod = new DAO.ProdutoClassDAO();
        
        DAO.VendaClassDAO venda = new DAO.VendaClassDAO();
        
        Classes.ClienteClass cliente1 = new Classes.ClienteClass(1,"allan sergio", 
                "073.899.479-00", "44-99812-5151", 27, "M");   
        Classes.ClienteClass cliente2 = new Classes.ClienteClass(2,"eduarda torres", 
                "073.899.479-00", "44-99812-5151", 24, "F");
        
        
        Classes.ProdutoClass prod1 = new Classes.ProdutoClass(1, "teclado",
                150.00, 5, "raizer");       
        Classes.ProdutoClass prod2 = new Classes.ProdutoClass(2, "mouse",
                200.00, 5, "raizer");
            
        
        Classes.VendaClass venda1 = new Classes.VendaClass(1, prod1,
                cliente2, "20/05/2023", 1);
        
        Classes.VendaClass venda2 = new Classes.VendaClass(2, prod2,
                cliente1, "20/05/2023", 2);
        
        
        cliente.adicionarCliente(cliente1);
        cliente.adicionarCliente(cliente2);        
   
        prod.adicionarProduto(prod1);
        prod.adicionarProduto(prod2);        

        venda.adicionarVenda(venda1);
        venda.adicionarVenda(venda2);        
        
        cliente.listarClientes();   
        
        prod.listarProdutos(); 
        
        venda.listarVendas();
                
        Classes.ClienteClass cliente3 = new Classes.ClienteClass(1,"allan sergio bispo", 
                "073.899.479-00", "44-99812-5151", 28, "M");         
        cliente.atualizarCliente(cliente3);
        
        cliente.listarClientes();          
        
        prod.removerProduto(1);
        prod.listarProdutos();
        
        venda.buscarProduto(2);
    }
    
}
