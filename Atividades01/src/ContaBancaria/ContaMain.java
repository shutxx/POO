/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author shuttxx
 */
public class ContaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaClass conta = new ContaClass("102785", "Allan Sergio", (float)1500.00);
        
        System.out.println("Ttitular: " + conta.getTitular() +
                           "\nNumero da conta: " + conta.getNumero() +
                           "\nSaldo: " + conta.getSaldo());
        
        System.out.println("++++++++++++++++++++++++++++");
        
        float deposito = (float) 500.00;
        System.out.println("Deposito de "+ deposito +
                           "\nNovo saldo: " +conta.deposito(deposito));
        
        System.out.println("++++++++++++++++++++++++++++");
        
        float saque = (float) 250.00;
        System.out.println("Saque de " + saque +
                           "\nNovo saldo: " + conta.saque(saque));
        
    }
    
}
