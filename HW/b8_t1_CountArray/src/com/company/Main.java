package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        List<Integer> array = fillArray(n);
        Map<Integer, Integer> count = new HashMap<>();

        System.out.println(array);

        for (int i = 0; i < array.size(); i++){
            int key = array.get(i);
            if (count.get(key) == null)
                count.put(key, 0);
            count.put(key, count.get(key) + 1);
        }

        System.out.println(count);
    }

    public static ArrayList<Integer> fillArray(int n){
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++)
            array.add(random.nextInt(n));
        return array;
    }
}
