package Aluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlunoUnipar allan = new AlunoUnipar("allan", "Sergio", 27, 10, "ADS");
        
        System.out.println(allan.getNome());
        System.out.println(allan.getNota());
        allan.estudar();
        System.out.println(allan.getNota());
    }
    
}
