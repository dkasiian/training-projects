package com.company;

public class View {
    // Text's constants
    public static final String INPUT_VALUE = "Input value = ";
    public static final String WRONG_INPUT_VALUE = "Wrong input! Repeat please! ";
    public static final String OUR_STRING = "Result value = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndValue(String message, String value){
        System.out.println(message + value);
    }
}
