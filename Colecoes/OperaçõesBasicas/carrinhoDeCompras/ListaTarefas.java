package Colecoes.OperaçõesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {


    // Lista para armazenar as tarefas
    private List<String> lista = new ArrayList<>();

    // Método principal
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionar algumas tarefas
        listaTarefas.adicionarTarefa("Comprar pão");
        listaTarefas.adicionarTarefa("Estudar para o exame");
        listaTarefas.adicionarTarefa("Ir à academia");

        // Remover uma tarefa
        listaTarefas.removerTarefa("Estudar para o exame");

        // Obter o número total de tarefas
        int totalTarefas = listaTarefas.obterNumeroTotalTarefas();
        System.out.println("Número total de tarefas: " + totalTarefas);

        // Obter as descrições das tarefas
        List<String> descricoes = listaTarefas.obterDescricoesTarefas();
        System.out.println("Descrições das tarefas: " + descricoes);
    }

    // Método para adicionar uma tarefa
    public void adicionarTarefa(String nome){
        lista.add(nome);
    }

    // Método para remover uma tarefa pela descrição
    public void removerTarefa(String descricao){
        lista.remove(descricao);
    }

    // Método para obter o número total de tarefas
    public int obterNumeroTotalTarefas(){
        return lista.size();
    }

    // Método para obter as descrições das tarefas
    public List<String> obterDescricoesTarefas(){
        return new ArrayList<>(lista);
    }
}
