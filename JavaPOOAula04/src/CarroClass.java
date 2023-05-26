/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class CarroClass {
    private String marca;
    private String montadora;
    private MotorClass motor;

    public CarroClass(){
        
    }
    public CarroClass(String marca, String modelo, MotorClass motor) {
        this.marca = marca;
        this.montadora = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public MotorClass getMotor() {
        return motor;
    }

    public void setMotor(MotorClass motor) {
        this.motor = motor;
    }
    
    public String acelerar(){
       return "Acelerando";
    }
    
    public String desligar(){
        return "Desligado";
    }
}
