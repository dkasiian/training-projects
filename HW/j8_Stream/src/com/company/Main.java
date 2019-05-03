package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {2, 10, 6, -2, 0, 4, 12, -40, 0, 2};
        System.out.println(Arrays.toString(intArr));

        // Find the average value of the elements of the array
        IntStream.of(intArr)
                .average()
                .ifPresent(average -> System.out.println("Average: " + average));

        // Find the minimum element
        IntStream.of(intArr)
                .min()
                .ifPresent(min -> System.out.println("Min value: " + min));

//        // Find the minimum element, value and index
//        IntStream.of(intArr)
//                .min()
//                .ifPresent(min -> System.out.println("Min value: " + min + ", index: " + Arrays.asList(intArr).indexOf(min)));

        // Count the number of elements equal to zero
        System.out.println("Number of zeros: " + IntStream.of(intArr).filter(e -> e == 0).count());

        // Count the number of elements greater than zero.
        System.out.println("Number of elements greater than zero: " + IntStream.of(intArr).filter(e -> e > 0).count());

        // Multiply array elements by number
        int number = 5;
        System.out.println("Array after multiplying by number: " + number);
        System.out.println(Arrays.toString(IntStream.of(intArr).map(e -> e * number).toArray()));
    }
}
