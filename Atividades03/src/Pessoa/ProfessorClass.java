/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author shuttxx
 */
public class ProfessorClass extends PessoaClass{
    private String especialização;

    public ProfessorClass(String especialização, String nome, int idade, float altura, float peso) {
        super(nome, idade, altura, peso);
        this.especialização = especialização;
    }

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }
}
