/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author shuttxx
 */
public class AlunoClass extends PessoaClass{
    private String ra;

    public AlunoClass(String ra, String nome, int idade, float altura, float peso) {
        super(nome, idade, altura, peso);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
