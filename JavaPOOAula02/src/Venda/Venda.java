package Venda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class Venda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VendaClass venda = new VendaClass();
        
        System.out.println(venda.getcliente());
        
        venda.setpreco(20);
        venda.setcliente("Allan");
        venda.setdata("20/03/2023");
        
        System.out.println(venda.getcliente());
        System.out.println(venda.getdata());
        System.out.println(venda.getpreco());
    }
    
}
