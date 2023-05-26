/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Carro;

/**
 *
 * @author shuttxx
 */
public class CarroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MotorClass motor = new MotorClass("2JZ",324, (float)3.4);
        CarroClass carro = new CarroClass("Toyota", "Supra", motor);
        
        System.out.println("Modelo: " + carro.getModelo() +
                           "\nMarca : " + carro.getMarca() +
                           "\nMotor: " + carro.getMotor().getModelo() + 
                           "\n"+carro.getMotor().getCilindradas() + " Litros" + 
                           "\n" + carro.getMotor().getPotencia() + " cavalos");
        carro.acelerar();
    }
    
}
