/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuttxx
 */
public class CadastroClientesClass {
    private List<ClienteClass> clientes = new ArrayList();
    
    public void adicionarCliente(ClienteClass cliente){
        clientes.add(cliente);
    }
    
    public void removerCliente(ClienteClass cliente){
        clientes.remove(cliente);
    }
    
    public String consultarCliente(String nomeCliente){
        for(ClienteClass c : clientes){
            if(c.getNome().equals(nomeCliente)){
                return c.getNome();
            }
        }
        return null;
    }
    
    public ClienteClass listarClientes(){
        for(ClienteClass c : clientes){
            System.out.println("Nome: "+ c.getNome());
        }
        return null;
    }
}
