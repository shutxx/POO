/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Telefone;

/**
 *
 * @author shuttxx
 */
public class PessoaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelefoneClass telefone = new TelefoneClass(998125151, 44);
        PessoaClass pessoa = new PessoaClass("Allan", telefone);
        pessoa.ligando();
    }
    
}
