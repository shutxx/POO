package Venda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class VendaClass {
    //Atributos
    private String cliente;
    private String data;
    private int quant;
    private float preco;
    private int idVenda;
    
    //Cliente
    public void setcliente(String cliente){
        this.cliente = cliente;
    }
    public String getcliente(){
        return cliente;
    }
    
    //Data
    public void setdata(String data){
        this.data = data;
    }
    public String getdata(){
        return data;
    }
    
    //Quantidade
    public void setquant(int quant){
        this.quant = quant;
    }
    public float getquant(){
        return quant;
    }
    
    //Preço
    public void setpreco(float preco){
        preco = preco + 20;
        this.preco = preco;
    }
    public float getpreco(){
        return preco;
    }
    
    //Quantidade
    public void setidVenda(int idVenda){
        this.idVenda = idVenda;
    }
    public int getidVenda(){
        return idVenda;
    }
}
