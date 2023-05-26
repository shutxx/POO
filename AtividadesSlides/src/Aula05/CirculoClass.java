/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Usuário
 */
public class CirculoClass {
    int raio;

    public CirculoClass(int raio) {
        this.raio = raio;
    }
    
    public float area(){
        return (float)3.14 * raio * raio;
    }
    
    public float perimetro(){
        return ((float)3.14 * 2) * raio;
    }
    
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
