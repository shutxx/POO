package Produto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class ProdutoClass {
    //Atributos
    private String nome;
    private float peso;
    private float preco;
    private String marca;
    private int quant;
    
    public String vence(){
        return null;
    }
    
    //Nome
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    
    //Peso
    public void setpeso(float peso){
        this.peso = peso;
    }
    public float getpeso(){
        return peso;
    }
    
    //Preço
    public void setpreco(float preco){
        this.preco = preco;
    }
    public float getpreco(){
        return preco;
    }
    
    //Marca
    public void setmarca(String marca){
        this.marca = marca;
    }
    public String getmarca(){
        return marca;
    }
    
    //Quantidade
    public void setquant(int quant){
        this.quant = quant;
    }
    public int getquant(){
        return quant;
    }
}
