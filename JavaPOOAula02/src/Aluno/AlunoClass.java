package Aluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class AlunoClass {
    //Atributos
    private int ra;
    private String nome;
    private String cpf;
    private int rg;
    private float nota;
    
    public String aprovarAluno(){
        this.nota = 100;
        return "Aprovado";
    }
    
    //RA
    public void setra(int ra){
        this.ra = ra;
    }
    public int getra(){
        return ra;
    }
    
    //Nome
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    
    //CPF
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getcpf(){
        return cpf;
    }
    
    //RG
    public void setrg(int rg){
        this.rg = rg;
    }
    public int getrg(){
        return rg;
    }
    
    //Nota
    public void setnota(float nota){
        this.nota = nota;
    }
    public float getnota(){
        return nota;
    }
}