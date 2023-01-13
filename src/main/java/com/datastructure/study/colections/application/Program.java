package com.datastructure.study.colections.application;

import com.datastructure.study.colections.model.People;
import com.datastructure.study.colections.util.AttPeopleConsumer;
import com.datastructure.study.colections.util.AttPeopleFunction;
import com.datastructure.study.colections.util.AttPeoplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<People> list = new ArrayList<>();

        list.add(new People("Abner", 29));
        list.add(new People("Erik", 39));
        list.add(new People("Juliana", 25));
        list.add(new People("Anna", 9));
        list.add(new People("Livia", 3));
        list.add(new People("Lara", 3));
        list.add(new People("Valter", 65));

        // PREDICADO: boolean
        // CONSUMER: void
        // FUNCTION: map

        // Instancia da Functional Interface (Forma 1) - PREDICADO
        list.removeIf(new AttPeoplePredicate());

        // Method Reference Static (Forma 2) - PREDICADO
        list.removeIf(People::staticPeople);

        // Method Reference não Static(Forma 3) - PREDICADO
        list.removeIf(People::nonStaticPeople);

        // Expressão Lambda(Forma 4) - PREDICADO
        list.removeIf(p -> p.getName().startsWith("A"));

        // -------------------------------------------------------------------

        // Instancia da Functional Interface (Forma 1) - CONSUMER
        list.forEach(new AttPeopleConsumer());

        // Method Reference Static (Forma 2) - CONSUMER
        list.forEach(People::staticUpdateAge);

        // Method Reference não Static(Forma 3) - CONSUMER
        list.forEach(People::nonStaticUpdateAge);

        // Expressão Lambda(Forma 4) - CONSUMER
        list.forEach(p -> p.setName(p.getName() + " Souza"));

        // Print com forEach
        list.forEach(System.out::println);
        System.out.println();

        // -------------------------------------------------------------------

        // Instancia da Functional Interface (Forma 1) - FUNCTION
        List<String> names = list.stream().map(new AttPeopleFunction()).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println();

        // Method Reference Static (Forma 2) - FUNCTION
        List<String> names2 = list.stream().map(People::staticUpdateName).collect(Collectors.toList());
        names2.forEach(System.out::println);
        System.out.println();

        // Method Reference não Static(Forma 3) - FUNCTION
        List<String> names3 = list.stream().map(People::nonStaticUpdateName).collect(Collectors.toList());
        names3.forEach(System.out::println);
        System.out.println();

        // Expressão Lambda(Forma 4) - FUNCTION
        List<String> names4 = list.stream().map(e -> e.getName().replace("a", "@")).collect(Collectors.toList());
        names4.forEach(System.out::println);
        System.out.println();
    }
}
