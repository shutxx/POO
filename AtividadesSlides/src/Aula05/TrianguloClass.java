/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;

/**
 *
 * @author Usuário
 */
public class TrianguloClass {
    int altura;
    int base;

    public TrianguloClass(int raio, int base) {
        this.altura = raio;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int raio) {
        this.altura = raio;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public float Area(){
        return (base * altura) / 2;
    }
    
    public float Perimetro(){
        return base + altura + altura;
    }
}
