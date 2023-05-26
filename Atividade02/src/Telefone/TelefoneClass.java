/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefone;

/**
 *
 * @author shuttxx
 */
public class TelefoneClass {
    private int ddd;
    private int numero;
    
    public TelefoneClass(int numero, int ddd) {
        this.numero = numero;
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDd(int ddd) {
        this.ddd = ddd;
    }
}
