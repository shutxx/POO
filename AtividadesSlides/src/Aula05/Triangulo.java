/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Triangulo;

/**
 *
 * @author Usuário
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TrianguloClass triangulo = new TrianguloClass(15, 5);
        
        System.out.println(triangulo.altura);
        System.out.println(triangulo.base);
        
        System.out.println(triangulo.Area());
        System.out.println(triangulo.Perimetro());
    }
    
}
