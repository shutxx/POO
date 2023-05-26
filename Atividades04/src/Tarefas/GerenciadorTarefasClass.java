/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarefas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuttxx
 */
public class GerenciadorTarefasClass {
    private List<TarefaClass> tarefas = new ArrayList();
    
    public void adicionarTarefa(TarefaClass tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(TarefaClass tarefa) {
        tarefas.remove(tarefa);
    }

    public String buscar(String tarefa){
        for(TarefaClass t : tarefas){
            if(t.getDescricao().equals(tarefa)){
                return t.getDescricao();
            }
        }
        return null;
    }
    
    public TarefaClass listarTarefas(){
        for(TarefaClass t : tarefas){
            System.out.println("Descricao: " + t.getDescricao());
        }
        return null;
    }
    
}
