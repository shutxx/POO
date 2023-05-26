/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja;

/**
 *
 * @author shuttxx
 */
public class LojaClass {
    private ProdutoClass produto;

    public LojaClass(ProdutoClass produto) {
        this.produto = produto;
    }

    public ProdutoClass getProduto() {
        return produto;
    }

    public void setProduto(ProdutoClass produto) {
        this.produto = produto;
    }
    
    public void vendedor(){
        System.out.println("Vendendo produto " + produto.getNome());
    }
}
