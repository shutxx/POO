/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuttxx
 */
public class ClienteClassDAO {
    private List<Classes.ClienteClass> clientes;
    
    public ClienteClassDAO() {
        clientes = new ArrayList<>();
    }
    
    public void adicionarCliente(Classes.ClienteClass cliente) {
        clientes.add(cliente);
    }
    
    public void atualizarCliente(Classes.ClienteClass cliente) {
        for (Classes.ClienteClass c : clientes) {
            if (c.getIdCliente() == cliente.getIdCliente()) {
                c.setNome(cliente.getNome());
                c.setCpf(cliente.getCpf());
                c.setTelefone(cliente.getTelefone());
                c.setIdade(cliente.getIdade());
                c.setGenero(cliente.getGenero());
                break;
            }
        }
    }
    
    public void removerCliente(String nome) {
        Classes.ClienteClass clienteRemover = null;
        for (Classes.ClienteClass c : clientes) {
            if (c.getNome().equals(nome)) {
                clienteRemover = c;
                break;
            }
        }
        if (clienteRemover != null) {
            clientes.remove(clienteRemover);
        }
    }
    
    public Classes.ClienteClass buscarCliente(String nome) {
        for (Classes.ClienteClass cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
    
    public void listarClientes() {
        for (Classes.ClienteClass cliente : clientes) {
            System.out.println("Id: " + cliente.getIdCliente() +
                               "\nNome: " + cliente.getNome() + 
                               "\nTelefone: " + cliente.getTelefone()+
                               "\nIdade: " + cliente.getIdade());            
            System.out.println("-----------------------");  
        }
    }
    
}
