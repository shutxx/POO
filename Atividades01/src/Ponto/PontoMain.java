/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ponto;

/**
 *
 * @author shuttxx
 */
public class PontoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PontoClass ponto = new PontoClass(50, 10);
        
        System.out.println("distancia entre " + ponto.getX() + " e " +
                            ponto.getY() + " e " + ponto.distancia());
    }
    
}
