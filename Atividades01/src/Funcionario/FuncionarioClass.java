/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author shuttxx
 */
public class FuncionarioClass {
    float imposto = 0;
    
    private String nome;
    private float salario;
    private String departamento;

    public FuncionarioClass(String nome, float salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public float imposto(){
        imposto =  salario * 10 / 100;
        float novoSalario = salario - imposto;
        System.out.println("Desconto total: " + imposto +
                           "\nSalario Liquido: " + novoSalario);
        return 0;
    }
}
