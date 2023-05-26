/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author shuttxx
 */
public class VendaClass {
    private int idVenda;
    private ProdutoClass produto;
    private ClienteClass cliente;
    private String data;
    private double preco;
    private int qtdeCompra;

    public VendaClass(int idVenda, ProdutoClass produto, ClienteClass cliente, String data, int qtdeCompra /*, double preco*/) {
        this.idVenda = idVenda;
        this.produto = produto;
        this.cliente = cliente;
        this.data = data;
        //this.preco = preco;
        this.qtdeCompra = qtdeCompra;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public ProdutoClass getProduto() {
        return produto;
    }

    public void setProduto(ProdutoClass produto) {
        this.produto = produto;
    }

    public ClienteClass getCliente() {
        return cliente;
    }

    public void setCliente(ClienteClass cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return produto.getPreco() * qtdeCompra;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdeCompra() {
        return qtdeCompra;
    }

    public void setQtdeCompra(int qtdeCompra) {
        this.qtdeCompra = qtdeCompra;
    }

    public void getProduto(ProdutoClass produto) {
    
    }

}
