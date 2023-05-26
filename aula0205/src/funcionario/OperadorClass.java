/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author shuttxx
 */
public class OperadorClass extends FuncionarioClass{
    
    @Override
    public void calcularSalario(){
        System.out.println("Salario Operario " + this.salario);
    }
}
