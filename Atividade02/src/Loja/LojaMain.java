/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Loja;

/**
 *
 * @author shuttxx
 */
public class LojaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProdutoClass produto = new ProdutoClass("Teclado", (float)150.00);
        LojaClass loja = new LojaClass(produto);
        
        loja.vendedor();
    }
    
}
