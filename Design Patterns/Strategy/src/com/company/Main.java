package com.company;

public class Main {

    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] arr = {1, 3, 9, 4, 2, 1};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(arr);

        int[] arr2 = {1, 3, 9, 4, 2, 1};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(arr2);

    }
}
