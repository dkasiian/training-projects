package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human(21, "Dmytro");
        System.out.println(human);

        Human humanCopy = (Human) human.copy();
        System.out.println(humanCopy);

        HumanFactory factory = new HumanFactory(humanCopy);
        Human h1 = factory.makeCopy();
        System.out.println(h1);

        factory.setPrototype(new Human(30, "Maria"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);
    }
}
