package com.company;

import java.util.ArrayList;

public class View {
    public static final String INPUT_NUMBER = "Pick a number between ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String WRONG_RANGE = "Wrong range! Repeat please! ";
    public static final String INCORRECT_NUMBER = "You didn't guess the number! ";
    public static final String CORRECT_NUMBER = "Victory! You guessed the number! ";
    public static final String OUR_NUMBER = "Your guess: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageWithRange(String message, int minBarrier, int maxBarrier){
        System.out.println(message + minBarrier + " and " + maxBarrier);
    }

    public void printUserHistory(ArrayList<Integer> userNumbers){
        System.out.println("It took you " + userNumbers.size() + " turns to guess my number.");
        for(int number : userNumbers)
            System.out.print("| " + number + " |");
    }
}
