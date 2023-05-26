package Aluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class AlunoUnipar {
        String nome;
        String sobreNome;
        int idade;
        int nota = 0;
        String curso;

    public AlunoUnipar(String nome, String sobreNome, int idade, int nota, String curso) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.nota = nota;
        this.curso = curso;
    }
    
    public void estudar(){
        if(this.nota <= 10){
            this.nota = nota + 1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
