/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veiculo;

/**
 *
 * @author shuttxx
 */
public class VeiculoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VeiculoClass[] veiculos = new VeiculoClass[3];
        
        veiculos[0] = new VeiculoClass();
        veiculos[0].setVelocidade(35);
        
        veiculos[1] = new CarroClass();
        veiculos[1].setVelocidade(25);
        
        veiculos[2] = new MotoClass();
        veiculos[2].setVelocidade(45);
        
        for(VeiculoClass veiculo: veiculos){
            veiculo.acelerar();
        }
        
    }
    
}
