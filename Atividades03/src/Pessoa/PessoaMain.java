/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pessoa;

/**
 *
 * @author shuttxx
 */
public class PessoaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlunoClass aluno = new AlunoClass("00230578",
                                         "Allan Sergio",
                                         27, (float)1.75, (float)94.50);
        
        ProfessorClass professor = new ProfessorClass("mestrado puc",
                                                              "Joao Chroma", 
                                                              30, 
                                                              (float)1.70,
                                                              (float)80.00);
        
        System.out.println(aluno.getNome());
        System.out.println(professor.getNome());
    }
    
}
