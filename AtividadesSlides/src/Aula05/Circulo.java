/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05;

/**
 *
 * @author Usuário
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CirculoClass circulo = new CirculoClass(14);
        
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());
    }
    
}
