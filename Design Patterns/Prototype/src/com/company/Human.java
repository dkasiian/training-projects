package com.company;

class Human implements Copyable {
    private int age;
    private String name;

    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(age, name);
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", name=" + name + "]";
    }
}
