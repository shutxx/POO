/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Livros;

/**
 *
 * @author shuttxx
 */
public class LivroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LivroClass livro = new LivroClass("Mussum", "Mussum", 1995);
        
        System.out.println("Livro: " + livro.getTitulo() + 
                "\nAutor: " + livro.getAutor() + 
                "\nAno: " + livro.getAno());
        livro.detalhes();
    }
    
}
