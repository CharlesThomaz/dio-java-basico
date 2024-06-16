package Colecoes.list.op.basic;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaDeTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t:tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);

    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();
        System.out.println("O número total de tarefas da lista é : " + listaDeTarefa.obterNumeroTotalTarefas());

        listaDeTarefa.adicionarTarefa("Tarefa1");
        System.out.println("O número total de tarefas da lista é : " + listaDeTarefa.obterNumeroTotalTarefas());

        listaDeTarefa.adicionarTarefa("Tarefa2");
        listaDeTarefa.adicionarTarefa("Tarefa3");
        System.out.println("O número total de tarefas da lista é : " + listaDeTarefa.obterNumeroTotalTarefas());

        listaDeTarefa.removerTarefa("Tarefa2");
        System.out.println("O número total de tarefas da lista é : " + listaDeTarefa.obterNumeroTotalTarefas());

        listaDeTarefa.obterDescricoesTarefas();

    }

}
