/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author shuttxx
 */
public class ContaBancariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaClass conta1 = new ContaClass("100000", "Allan Sergio", 5000.00);
        ContaClass conta2 = new ContaClass("100000", "Henrique Torres", 5000.00);
        ContaClass conta3 = new ContaClass("100000", "Eduarda Larissa", 5000.00);
        
        GerenciamentoClass acao = new GerenciamentoClass();
        
        acao.adicionar(conta1);
        acao.adicionar(conta2);
        acao.adicionar(conta3);       
        
        acao.listarTitulares();
        
        System.out.println(acao.consultarConta("Allan Sergio"));
        
        acao.remover(conta1);
        
        acao.listarTitulares();
    }
    
}
