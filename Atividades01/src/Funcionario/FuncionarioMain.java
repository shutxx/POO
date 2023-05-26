/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funcionario;

/**
 *
 * @author shuttxx
 */
public class FuncionarioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuncionarioClass funcionario = new FuncionarioClass("Allan Sergio",
                                           (float)1800.0, "Mecanico");
        
        System.out.println("Nome: " + funcionario.getNome() +
                           "\nDepartamento: " + funcionario.getDepartamento()+
                           "\nSalario: " + funcionario.getSalario());
        funcionario.imposto();
    }
    
}
