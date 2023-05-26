/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Retangulo;

/**
 *
 * @author shuttxx
 */
public class RetanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RetanguloClass retangulo = new RetanguloClass((float)25.00, (float)30.00);
        
        System.out.println("Altura: " + retangulo.getAltura() +
                           "\nLargura: " + retangulo.getLargura());
        
        System.out.println("Area total : " + retangulo.area() +
                           "\nPerimetro: " + retangulo.perimetro());        
    }
    
}
