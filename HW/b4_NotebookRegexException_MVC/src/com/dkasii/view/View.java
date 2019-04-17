package com.dkasii.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.dkasii.view.ViewConstants.INPUT_STRING_DATA;
import static com.dkasii.view.ViewConstants.WRONG_INPUT_DATA;

/**
 * Class that corresponds to all UI logic of the application
 */
public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    // new Locale("en")); English locale
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));


    public void printMessage(String message) {
        System.out.println(message);
    }

    private String concatMessages(String ... messages) {
        StringBuilder concatMessage = new StringBuilder();
        for (String message : messages)
            concatMessage = concatMessage.append(message + " ");
        return new String(concatMessage);
    }

    public void printStringInput(String message) {
        printMessage(concatMessages(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput() {
        printMessage(bundle.getString(WRONG_INPUT_DATA));
    }

    public void printException(Exception e) {
        System.out.println(e);
    }
}
