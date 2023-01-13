package com.datastructure.study.colections.util;

import com.datastructure.study.colections.model.People;

import java.util.function.Predicate;

// Classe que implementa uma Funcional Interface
public class AttPeoplePredicate implements Predicate<People> {

    // Predicado que retorna um boolean
    @Override
    public boolean test(People p) {
        return p.getAge() < 5;
    }
}
