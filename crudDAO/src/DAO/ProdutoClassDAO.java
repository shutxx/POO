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
public class ProdutoClassDAO {
    private List<Classes.ProdutoClass> produtos;

    public ProdutoClassDAO() {
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Classes.ProdutoClass produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(Classes.ProdutoClass produto) {
        for (Classes.ProdutoClass p : produtos) {
            if (p.getId() == produto.getId()) {
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
                break;
            }
        }
    }

    public void removerProduto(int id) {
        Classes.ProdutoClass produtoRemover = null;
        for (Classes.ProdutoClass p : produtos) {
            if (p.getId() == id) {
                produtoRemover = p;
                break;
            }
        }
        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
        }
    }

    public Classes.ProdutoClass buscarProduto(int id) {
        for (Classes.ProdutoClass produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        for (Classes.ProdutoClass p : produtos) {
            System.out.println("Nome: " + p.getNome() + 
                               "\nMarca: " + p.getMarca() + 
                               "\nPreço: " + p.getPreco());
            System.out.println("-----------------------");  
        }
    }
}
