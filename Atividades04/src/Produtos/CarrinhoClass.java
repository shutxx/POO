/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuttxx
 */
public class CarrinhoClass {
    private List<ProdutosClass> carinho = new ArrayList();
    
    public void adicionar(ProdutosClass produto){
        carinho.add(produto);
    }
    
    public void remover(ProdutosClass produto){
        carinho.remove(produto);
    }
    
    public String consutar(String nomeProduto){
        for(ProdutosClass p : carinho){
            if(p.getNome().equals(nomeProduto)){
                return p.getNome();
            }
        }
        return null;
    }
    
    public ProdutosClass listarTodos(){
        for(ProdutosClass p : carinho){
            System.out.println("Nome: " + p.getNome());
        }
        return null;
    }
}
