/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Usuário
 */
public class RetanguloClass {
    int altura;
    int largura;

    public RetanguloClass(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int perimetro(){
        altura = altura * 2;
        largura = largura * 2;
        return altura + largura;       
    }
    
    public int area(){
        return altura * largura;
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    
}
