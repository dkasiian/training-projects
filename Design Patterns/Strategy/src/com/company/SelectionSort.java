package com.company;

import java.util.Arrays;

class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sort");
        System.out.println(Arrays.toString(arr));
        for (int barrier = 0; barrier < arr.length; barrier++){
            for (int i = barrier+1; i < arr.length; i++){
                if(arr[i] < arr[barrier]){
                    int temp = arr[i];
                    arr[i] = arr[barrier];
                    arr[barrier] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
