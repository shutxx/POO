/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estoque;

/**
 *
 * @author shuttxx
 */
public class EstoqueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProdutoClass iten1 = new ProdutoClass("Teclado", 150.50, 5);
        ProdutoClass iten2 = new ProdutoClass("Mouse", 100.50, 5);
        ProdutoClass item3 = new ProdutoClass("Monitor", 1500.50, 5);
        
        EstoqueClass prod = new EstoqueClass();
        prod.adicionarProduto(iten1);
        prod.adicionarProduto(iten2);
        prod.adicionarProduto(item3);
       
        prod.listarProdutos();
        
        System.out.println("Removendo: " + prod.consultarProduto("Monitor"));
        System.out.println("++++++++++++++++++++++++++++");
        
        prod.removerProduto(item3);                
        
        prod.listarProdutos();
        
    }
    
}
