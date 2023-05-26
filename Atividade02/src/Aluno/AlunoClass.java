/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

/**
 *
 * @author shuttxx
 */
public class AlunoClass {
    private String nome;
    private String ra;
    private DiciplinaClass diciplina;

    public AlunoClass(String nome, String ra, DiciplinaClass diciplina) {
        this.nome = nome;
        this.ra = ra;
        this.diciplina = diciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public DiciplinaClass getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(DiciplinaClass diciplina) {
        this.diciplina = diciplina;
    }
    
}
