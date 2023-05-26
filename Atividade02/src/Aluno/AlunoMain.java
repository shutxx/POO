/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aluno;

/**
 *
 * @author shuttxx
 */
public class AlunoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DiciplinaClass diciplina = new DiciplinaClass("POO", (float)40.00);
        AlunoClass aluno = new AlunoClass("Allan Sergio", "00230578", diciplina);
        
        System.out.println("Mtriculando aluno " + aluno.getNome() + " na materia " + aluno.getDiciplina().getNome());
    }
    
}
