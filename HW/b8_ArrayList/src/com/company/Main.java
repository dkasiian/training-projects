package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayNotRemove<String> arrayNotRemove = new ArrayListNotRemove<>();

        System.out.println(arrayNotRemove.isEmpty());

        arrayNotRemove.add("Line1");
        arrayNotRemove.add("Line2");
        arrayNotRemove.add("Line3");
        arrayNotRemove.add("Line4");
        arrayNotRemove.add("Line5");

        System.out.println(arrayNotRemove.isEmpty());

        System.out.println(arrayNotRemove.get(0));
        System.out.println(arrayNotRemove.get(3));

        System.out.println(arrayNotRemove.size());

        arrayNotRemove.update(0, "Line0");
        System.out.println(arrayNotRemove.get(0));
        System.out.println(arrayNotRemove.size());

        for(String s : arrayNotRemove)
            System.out.println(s);
    }
}
