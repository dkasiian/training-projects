package com.company;

public class Main {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
