package com.datastructure.study.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithArrayList {

    public static void main(String[] args) {

        // Declarando uma lista com ArrayList
        List<String> list = new ArrayList<>();

        // Adicionando valores nos elementos de forma encadeada
        list.add("Abner");
        list.add("Juliana");
        list.add("Anna");
        list.add("Alicia");
        list.add("Livia");
        list.add("Lara");

        // Imprimindo com toString
        System.out.println(list);
        System.out.println("---------------------------");

        // Imprimindo de forma encadeada(percorrendo) com forEach
        for (String e : list)
            System.out.println(e);
        System.out.println("---------------------------");

        // Adicionando um elemento no meio da lista (informando o índex de posição)
        list.add(2, "Marcia");
        list.add(0, "Reginaldo");
        System.out.println(list);
        System.out.println("---------------------------");

        // Verificando o tamando da lista
        System.out.println("Tamanho da Lista/Quantidade de Elementos: " + list.size());
        System.out.println("---------------------------");

        // Removendo um elemento da lista a partir da comparação de valor ou índex
        list.remove("Marcia");
        list.remove(0);
        System.out.println(list);
        System.out.println("---------------------------");

        // Removendo elementos por Predicado(boolean)/(lambda)
        list.removeIf(e -> e.startsWith("A"));
        System.out.println(list);
        System.out.println("---------------------------");

        // Buscando o índex de um elemento
        System.out.println(list.indexOf("Lara"));
        System.out.println(list.indexOf("Abner")); // Caso não encontre, ele retorna -1
        System.out.println("---------------------------");

        // Filtrando a lista
        List<String> result = list.stream().filter(e -> e.charAt(0) == 'L').collect(Collectors.toList());
        System.out.println(result);
        /* list é um tipo antigo, ao filtrar transformamos ele no tipo stream e depois convertemos
        de volta no tipo list com .collect*/
        System.out.println("---------------------------");

        // Obtendo um elemento da Lista
        String name = list.stream().filter(e -> e.startsWith("J")).findFirst().orElse(null);
        String name2 = list.stream().filter(e -> e.startsWith("T")).findFirst().orElse(null);
        System.out.println(name);
        System.out.println(name2);
    }
}
