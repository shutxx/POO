/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author shuttxx
 */
public class TrianguloClass extends FiguraGeometricaClass{

    public TrianguloClass(double altura, double largura) {
        super(altura, largura);
    }
    
    public double calcularArea(){
        return (getAltura() * getLargura()) / 2;
    }
    
    public double calcularPerimetro(){
        double lado = Math.sqrt((getAltura() * getLargura()) + (getAltura() * getLargura()));
        return  getAltura() + getLargura() + lado;
    }
}
