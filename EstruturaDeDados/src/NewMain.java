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
        int idade = 16;
        
        if (idade > 18){
            System.out.println("Maior de idade");
        }else if (idade == 18){
            System.out.println("Voce tem 18 anos");
        }else{
            System.out.println("Menor de idade");
        }
        
        int ano = 1000;
        switch(ano){
            case 1000:
                System.out.println("Muito velho");
                break;
            case 2000:
                System.out.println("milenar");
                break;
            default:
                System.out.println("Fim");
        }
    }
    
}
