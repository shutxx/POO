/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MotorClass motor1 = new MotorClass(80, "4 tempos em linha", 1599);
        CarroClass carro = new CarroClass("Chevrolet", "Chevette", motor1);

        System.out.println("Marca: " + carro.getMarca()
                + "\nMontadora: " + carro.getMontadora()
                + "\n" + carro.getMotor().getModelo()
                + "\nCilindradas: " + carro.getMotor().getPotencia()
                + "\nPotencia: " + carro.getMotor().getCilindrada());

        CarroClass acao = new CarroClass();

        System.out.println(acao.acelerar());
        System.out.println(acao.desligar());
    }
}
