/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefone;

/**
 *
 * @author shuttxx
 */
public class PessoaClass {
    private String nome;
    private TelefoneClass telefone;

    public PessoaClass(String nome, TelefoneClass telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TelefoneClass getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneClass telefone) {
        this.telefone = telefone;
    }
    
    public void ligando(){
        System.out.println("Ligando para " + "(" + telefone.getDdd() + ")" + telefone.getNumero());
    }

}
