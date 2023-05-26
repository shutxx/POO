/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desenhar;

/**
 *
 * @author shuttxx
 */
public class DesenhoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DesenharClass[] desenhos = new DesenharClass[4];
        desenhos[0] = new DesenharClass();
        desenhos[1] = new CirculoClass();
        desenhos[2] = new RetanguloClass();
        desenhos[3] = new TrianguloClass();
        
        for(DesenharClass desenho: desenhos){
            desenho.desenhar();
        }
                
    }
    
}
