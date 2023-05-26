
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Produtos;

/**
 *
 * @author shuttxx
 */
public class CarrinhoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProdutosClass prod1 = new ProdutosClass("Monitor", 2000.00, 5);
        ProdutosClass prod2 = new ProdutosClass("Headset", 200.00, 5);
        ProdutosClass prod3 = new ProdutosClass("Notbook", 4000.00, 5);
        
        CarrinhoClass carinho = new CarrinhoClass();
        
        carinho.adicionar(prod1);
        carinho.adicionar(prod2);
        carinho.adicionar(prod3);
        
        carinho.listarTodos();
        
        System.out.println(carinho.consutar("Monitor"));
        
        carinho.remover(prod1);
        
        carinho.listarTodos();       
    }
    
}
