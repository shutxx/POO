/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Carro;

/**
 *
 * @author shuttxx
 */
public class CarroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarroClass carro = new CarroClass("volkswagen", "Fusca", 1962);
        
        System.out.println("Modelo: " + carro.getModelo() +
                           "\nMarca: " + carro.getMarca() +
                           "\nAno: " + carro.getAno());
    }
    
}
