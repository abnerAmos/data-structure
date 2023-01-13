package com.datastructure.study.colections.util;

import com.datastructure.study.colections.model.People;

import java.util.function.Consumer;

public class AttPeopleConsumer implements Consumer<People> {
    @Override
    public void accept(People p) {
        p.setAge(p.getAge() + 1);
    }
}
