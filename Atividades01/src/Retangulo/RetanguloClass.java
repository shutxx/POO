/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retangulo;

/**
 *
 * @author shuttxx
 */
public class RetanguloClass {
    private float largura;
    private float altura;

    public RetanguloClass(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float area(){
        return largura * altura;
    }
    public float perimetro(){
        return largura * 2 + altura * 2;
    }
}
