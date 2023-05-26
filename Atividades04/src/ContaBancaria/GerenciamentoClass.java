/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author shuttxx
 */
public class GerenciamentoClass {
    private List<ContaClass> contas = new ArrayList();
    
    public void adicionar(ContaClass cliente){
        contas.add(cliente);
    }
    
    public void remover(ContaClass cliente){
        contas.remove(cliente);
    }
    
    public String consultarConta(String titular){
        for(ContaClass c : contas){
            if(c.getTitular().equals(titular)){
                return c.getTitular();
            }
        }
        return null;
    }
    
    public ContaClass listarTitulares(){
        for(ContaClass c : contas){
            System.out.println("Titular: " + c.getTitular());
        }
        return null;
    }
}
