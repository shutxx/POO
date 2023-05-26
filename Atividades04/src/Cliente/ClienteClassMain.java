/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cliente;

/**
 *
 * @author shuttxx
 */
public class ClienteClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteClass cliente1 = new ClienteClass("Allan Sergio", "Rua Belo Horizonte", "(44)998125151");
        ClienteClass cliente2 = new ClienteClass("Eduarda Torres", "Rua Belo Horizonte", "(44)9999999");
        ClienteClass cliente3 = new ClienteClass("Henrique Alexandre", "Rua Belo Horizonte", "(44)88888888");
        CadastroClientesClass cadastro = new CadastroClientesClass();
        
        cadastro.adicionarCliente(cliente1);
        cadastro.adicionarCliente(cliente2);
        cadastro.adicionarCliente(cliente3);
        
        System.out.println(cadastro.consultarCliente("Henrique Alexandre"));
        
        cadastro.listarClientes();
    }
    
}
