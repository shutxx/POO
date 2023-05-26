/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05;

/**
 *
 * @author Usuário
 */
public class Retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RetanguloClass retangulo = new RetanguloClass(10, 10);
        
        System.out.println("Perimetro total: " + retangulo.perimetro());
        System.out.println("Area total: " + retangulo.area());
    }    
}
