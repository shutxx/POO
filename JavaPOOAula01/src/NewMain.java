

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro gol;
        Carro corsa;
        Carro lancer;
        
        gol = new Carro();
        corsa = new Carro("vermelha");
        lancer = new Carro();
        
        System.out.println("Cor Antes " + gol.getCor() + '\n');
        
        gol.setCor("Amarelo");
        
        System.out.println("Nova Cor " + gol.getCor());
                
    }
    
}
