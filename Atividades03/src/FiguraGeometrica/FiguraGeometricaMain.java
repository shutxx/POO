/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author shuttxx
 */
public class FiguraGeometricaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RetanguloClass retangulo = new RetanguloClass(25, 25);
        TrianguloClass triangulo = new TrianguloClass(50, 50);
        
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
        
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
    }
    
}
