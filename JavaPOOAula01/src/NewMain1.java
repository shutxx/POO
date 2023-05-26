/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa allan;
        Pessoa eduarda;
        
        allan = new Pessoa();
        eduarda = new Pessoa("feminino");
        
        System.out.println("Sexo Antes " + allan.getSexo() + '\n');
        allan.setSexo("Masculino");
        System.out.println("Novo Sexo " + allan.getSexo());
        
        System.out.println("Idade Antes " + allan.getIdade()+ '\n');
        allan.setIdade(27);
        System.out.println("Nova Idade " + allan.getIdade());
        
    }
    
}
