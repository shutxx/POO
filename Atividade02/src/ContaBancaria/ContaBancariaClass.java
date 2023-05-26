/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author shuttxx
 */
public class ContaBancariaClass {
    private ClienteClass cliente;

    public ContaBancariaClass(ClienteClass cliente) {
        this.cliente = cliente;
    }

    public ClienteClass getCliente() {
        return cliente;
    }

    public void setCliente(ClienteClass cliente) {
        this.cliente = cliente;
    }
    
    public double sacar(){
        System.out.println("Sacando valor " + cliente.getNome());    
        return 0;
    }
}
