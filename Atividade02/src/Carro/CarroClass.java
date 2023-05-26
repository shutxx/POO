/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author shuttxx
 */
public class CarroClass {
    private String marca;
    private String modelo;
    private MotorClass motor;

    public CarroClass(String marca, String modelo, MotorClass motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MotorClass getMotor() {
        return motor;
    }

    public void setMotor(MotorClass motor) {
        this.motor = motor;
    }
    
    public void acelerar(){
        System.out.println("Acelerando... 350kp/h");
    }

}
