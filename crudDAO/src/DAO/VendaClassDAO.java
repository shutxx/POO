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
public class VendaClassDAO {
    private List<Classes.VendaClass> vendas;
    
    public VendaClassDAO() {
        vendas = new ArrayList<>();
    }
    
    public void adicionarVenda(Classes.VendaClass venda) {
        vendas.add(venda);
    }
    
    public void atualizarVenda(Classes.VendaClass venda) {
        for (Classes.VendaClass v : vendas) {
            if (v.getIdVenda() == venda.getIdVenda()) {
                v.getProduto(venda.getProduto());               
            }
        }
    }
    
    public void removerVenda(int id) {
        Classes.VendaClass produtoVenda = null;
        for (Classes.VendaClass v : vendas) {
            if (v.getIdVenda()== id) {
                produtoVenda = v;
                break;
            }
        }
        if (produtoVenda != null) {
            vendas.remove(produtoVenda);
        }
    }
    public Classes.VendaClass buscarProduto(int id) {
        for (Classes.VendaClass venda : vendas) {
            if (venda.getIdVenda() == id) {
                return venda;
            }
        }
        return null;
    }   
    
    public void listarVendas() {
        for (Classes.VendaClass v : vendas) {
            System.out.println("ID: " + v.getIdVenda() +
                               "\nCliente: " + v.getCliente().getNome() + 
                               "\nProduto " + v.getQtdeCompra()+ " " + v.getProduto().getNome() +
                               "\nPreço: " + v.getProduto().getPreco() +
                               "\nPreço Total: " + v.getPreco());
            System.out.println("-----------------------");  
        }
    }    

}
