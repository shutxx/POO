/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animal;

/**
 *
 * @author shuttxx
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalClass animal = new AnimalClass("Animal", "Desconhecido");
        CachorroClass cachorro = new CachorroClass("Luke", "Canino");
        GatoClass gato = new GatoClass("chanim", "felino");
        
        System.out.println(cachorro.getEspecie());
        System.out.println(cachorro.getNome());
        cachorro.emitirSom();
        System.out.println("++++++++++++++++++++++++");
        System.out.println(gato.getEspecie());
        System.out.println(gato.getNome());
        gato.emitirSom();
    }
    
}
