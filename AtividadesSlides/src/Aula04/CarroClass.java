package Carro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class CarroClass {
    //Atributos
    private String cor;
    private String modelo;
    private String marca;
    private String ano;
    private float preco;
    
    public String acelera(){
        return "200kph";
    }
    
    //Cor
    public void setcor(String cor){
        this.cor = cor;
    }
    public String getcor(){
        return cor;
    }
    
    //Modelo
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    public String getmodelo(){
        return modelo;
    }
    
    //Marca
    public void setmarca(String marca){
        this.marca = marca;
    }
    public String getmarca(){
        return marca;
    }
    
    //Ano
    public void setano(String ano){
        this.ano = ano;
    }
    public String getano(){
        return ano;
    }
    
    //Preço
    public void setpreco(float preco){
        this.preco = preco;
    }
    public float getpreco(){
        return preco;
    }
}
