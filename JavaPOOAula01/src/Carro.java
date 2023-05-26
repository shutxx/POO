/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class Carro {
    //Atributos
    private String cor;
    private String modelo;
    private int preco;
    
    
    //Metodos
    public Carro(){   
    }
    
    public Carro(String cor){
        this.cor = cor;
    }
    
    public  void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
}
