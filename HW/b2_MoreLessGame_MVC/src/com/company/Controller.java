package com.company;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);

        model.setRandomNumber();
        model.setDiapason();

        while(true){
            model.setUserNumber(inputIntValueWithScannerAndDiapason(sc));
            if (model.compareNumbers()){
                view.printMessage(View.CORRECT_NUMBER);
                view.printUserHistory(model.getUserNumbers());
                break;
            }
            view.printMessage(View.INCORRECT_NUMBER + View.OUR_NUMBER + model.getUserNumber());
        }
    }

    private int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int result;
        view.printMessageWithRange(View.INPUT_NUMBER, model.getMinBarrier(), model.getMaxBarrier());

        while(true) {
            while (!sc.hasNextInt()) {
                view.printMessageWithRange(View.WRONG_INPUT + View.INPUT_NUMBER,
                        model.getMinBarrier(), model.getMaxBarrier());
                sc.next();
            }

            result = sc.nextInt();
            if (result < model.getMinBarrier() || result > model.getMaxBarrier()) {
                view.printMessageWithRange(View.WRONG_RANGE + View.INPUT_NUMBER,
                        model.getMinBarrier(), model.getMaxBarrier());
                continue;
            }
            break;
        }
        return result;
    }
}
