package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefa {

    private static String descricao;
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for (Tarefa t : tarefaList) {
           if (t.getDescricao().equals(descricao)) {
               tarefasParaRemover.add(t);
           }
           tarefaList.removeAll(tarefasParaRemover);
       }


    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total na lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adicionarTarefa( descricao = "Tarefa1");
        listaTarefa.adicionarTarefa( descricao = "Tarefa1");
        listaTarefa.adicionarTarefa( descricao = "Tarefa2");

        //listaTarefa.removerTarefa( descricao = "Tarefa1");


        System.out.println("O número total na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
