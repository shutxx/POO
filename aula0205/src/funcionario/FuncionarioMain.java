/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

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
        FuncionarioClass[] funcionarios = new FuncionarioClass[3];
        
        funcionarios[0] = new FuncionarioClass();
        funcionarios[0].setSalario(1500.00);
        
        funcionarios[1] = new GerenteClass();
        funcionarios[1].setSalario(1500.00);
        
        funcionarios[2] = new OperadorClass();
        funcionarios[2].setSalario(1500.00);
        

        for(FuncionarioClass funcionario: funcionarios){           
            funcionario.calcularSalario();
        }
    }
    
}
