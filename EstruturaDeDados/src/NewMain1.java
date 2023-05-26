
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] vetor = new int[10];
       Scanner scan = new Scanner(System.in);
       
       for(int i = 0; i < vetor.length; i++){
           System.out.print("Adicione um numero na posicao " + i + ": ");
           vetor[i] = scan.nextInt();
       }
       for(int i = 0; i < vetor.length; i++){
           System.out.println(i);
       }   
    }
    
}
