/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estoque;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuttxx
 */
public class EstoqueClass {
    private List<ProdutoClass> produtos = new ArrayList();
    
    public void adicionarProduto(ProdutoClass produto){
        produtos.add(produto);
    }
    
    public void removerProduto(ProdutoClass produto){
        produtos.remove(produto);
    }
    
    public String consultarProduto(String nomeProduto){
        for(ProdutoClass p : produtos){
            if(p.getNome().equals(nomeProduto)){
                return p.getNome();
            }
        }
        return null;
    }
    
    public ProdutoClass listarProdutos(){
        for(ProdutoClass p : produtos){
            System.out.println("Nome: " + p.getNome() +
                               "\nPreço: " + p.getPreco() +
                               "\nQuantidade: " + p.getQuantidade());
            System.out.println("+++++++++++++++++++++++++++++++++");
        }
        return null;
    }
}
