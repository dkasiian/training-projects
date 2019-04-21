package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	   com.company.LinkedList<String> list = new LinkedList<>();

        System.out.println(list.isEmpty());

        list.addFirst("line1");
        list.addFirst("line2");
        list.addFirst("line3");
        list.addFirst("line4");
        System.out.println(list);
        System.out.println(list.isEmpty());

        System.out.println(list.get(0));
//		System.out.println(list.get(4));   //exception

        list.addLast("line5");
        Iterator itr = list.iterator();
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        for(String x : list)
            System.out.print(x + " ");
        System.out.println();

        list.insertAfter("line2", "line2_2");
        System.out.println(list);
        System.out.println(list.getLast());

        list.insertBefore("line4", "line3_2");
        System.out.println(list);

        list.remove("line1");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        System.out.println(list.contains("line2"));

        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
