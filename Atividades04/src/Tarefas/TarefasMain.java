/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarefas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuttxx
 */
public class TarefasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarefaClass tarefa1 = new TarefaClass("fazer trabalhos", "15/05/2023", 5);
        TarefaClass tarefa2 = new TarefaClass("fazer prova", "20/05/2023", 2);
        TarefaClass tarefa3 = new TarefaClass("fazer portifolio", "25/05/2023", 1);
        
        GerenciadorTarefasClass gerenciar = new GerenciadorTarefasClass();
        
        gerenciar.adicionarTarefa(tarefa1);
        gerenciar.adicionarTarefa(tarefa2);
        gerenciar.adicionarTarefa(tarefa3);
        
        gerenciar.listarTarefas();
        
        System.out.println("Excluindo... " + gerenciar.buscar("fazer prova"));
        gerenciar.removerTarefa(tarefa2);
        
        gerenciar.listarTarefas();
    }
    
}
