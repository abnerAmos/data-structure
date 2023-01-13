package com.datastructure.study.colections.model;

public class People {

    private String name;
    private Integer age;

    public People() {
    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //-----------------------------------------------------------------

    // Predicado Static para Method Reference
    // Por ser static, necessário informar o paramêtro que irá tratar
    public static boolean staticPeople(People p) {
        return p.age < 10;
    }

    // Predicado não Static para Method Reference
    // Usa o atributo da própria classe
    public boolean nonStaticPeople() {
        return age > 60;
    }

    //-----------------------------------------------------------------

    // Consumer Static para Method Reference
    public static void staticUpdateAge(People p) {
        p.setAge(p.getAge() + 1);
    }

    // Consumer não Static para Method Reference
    public void nonStaticUpdateAge() {
        age = age + 1;
    }

    //-----------------------------------------------------------------

    public static String staticUpdateName(People p) {
        return p.getName().replace(" ", "-");
    }

    public String nonStaticUpdateName() {
        return getName().toUpperCase().replace(" ", "-");
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
