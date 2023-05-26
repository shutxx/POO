package Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class PessoaClass {
    //Atributos
    private String nome;
    private String sobrenome;
    private int anoNasci;
    private int idade;
    private String cpf;
    
    public String morre(){
        return null;
    }
    
    //Nome
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    
    //sobrenome
    public void setsobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getsobrenome(){
        return sobrenome;
    }
    
    //Ano de nascimento
    public void setsanoNasci(int anoNasci){
        this.anoNasci = anoNasci;
    }
    public int getanoNasci(){
        return anoNasci;
    }
    
    //Idade
    public void setidade(int idade){
        this.idade = idade;
    }
    public int getidade(){
        return idade;
    }
    
    //cpf
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getcpf(){
        return cpf;
    }
    
}
