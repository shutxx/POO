/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class Pessoa {
    //Atributos
    private int idade;
    private String sexo;
    
    //Metodos
    public Pessoa(){      
    }
    
    public Pessoa(String sexo){
        this.sexo = sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getIdade(){
        return idade;
    }
}
