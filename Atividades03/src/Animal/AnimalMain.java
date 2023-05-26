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
        CachorroClass cachorro = new CachorroClass(" poodle", "Luke", "mini", 3);
        GatoClass gato = new GatoClass("Cinza", "Juvenal", "Gato pelado", 5);
        
        System.out.println(cachorro.getNome());
        System.out.println(gato.getNome());
    }
    
}
