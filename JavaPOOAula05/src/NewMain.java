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
        AlunoClass aluno = new AlunoClass("00230578", "Allan Sergio Bispo", 27, (float)1.75, (float)94.50);
        
        System.out.println("Nome:" + aluno.getNome() +
                "\nRA:" + aluno.getRa());
    }
    
}
