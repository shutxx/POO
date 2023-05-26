/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author Usuário
 */
public class AminalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalClass[] animais = new AnimalClass[2];
        animais[0] = new DogClass();
        animais[1] = new CatClass();

        for (AnimalClass animal : animais) {
            animal.emitirSom();
        }
    }
    
}
