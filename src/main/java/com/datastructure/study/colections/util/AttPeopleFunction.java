package com.datastructure.study.colections.util;

import com.datastructure.study.colections.model.People;

import java.util.function.Function;

public class AttPeopleFunction implements Function<People, String> {
    @Override
    public String apply(People p) {
        return p.getName().toUpperCase();
    }
}
