/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author shuttxx
 */
public class RetanguloClass extends FiguraGeometricaClass{

    public RetanguloClass(double altura, double largura) {
        super(altura, largura);
    }
    
    public double calcularArea(){
        return getAltura() * getLargura();
    }
    
    public double calcularPerimetro(){
        return 2 * (getAltura() + getLargura());
    }
}
