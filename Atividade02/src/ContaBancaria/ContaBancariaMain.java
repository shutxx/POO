/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author shuttxx
 */
public class ContaBancariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        ClienteClass cliente = new ClienteClass("Allan", "07389947900");
        ContaBancariaClass conta = new ContaBancariaClass(cliente);
        
        conta.sacar();
    }
    
}
