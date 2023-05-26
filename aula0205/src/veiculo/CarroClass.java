/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author shuttxx
 */
public class CarroClass extends VeiculoClass{
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando carro a " + this.velocidade);
    }
    
}
