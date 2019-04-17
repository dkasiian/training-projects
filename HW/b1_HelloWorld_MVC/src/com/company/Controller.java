package com.company;

import java.util.Scanner;

public class Controller {
    // The Constants
    private static final String FIRST_WORD = "Hello";
    private static final String SECOND_WORD = "world!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUserInput(){
        Scanner sc = new Scanner(System.in);

        model.setFirstValue(inputStringValueWithScanner(sc, FIRST_WORD));
        model.setSecondValue(inputStringValueWithScanner(sc, SECOND_WORD));

        view.printMessageAndValue(View.OUR_STRING, model.getJoinedValue());
    }

    private String inputStringValueWithScanner(Scanner sc, String matchValue) {
        view.printMessage(View.INPUT_VALUE);
        String inputedValue = sc.next();
        while (!inputedValue.equals(matchValue)) {
            view.printMessage(View.WRONG_INPUT_VALUE + View.INPUT_VALUE);
            inputedValue = sc.next();
        }
        return inputedValue;
    }

}
