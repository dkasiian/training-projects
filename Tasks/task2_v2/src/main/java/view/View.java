package view;

import model.entity.Conference;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static String MESSAGES_BUNDLE_NAME = "messages";
    private static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
//            new Locale("ua", "UA"));   // Ukrainian
            new Locale("en"));        // English

    public View(){

    }

    /**
     * Prints one message.
     *
     * @param message message to print
     */
    public void printMessage(String message){
        System.out.println(bundle.getString(message));
    }

    public void printIntResult(String message, int result){
        System.out.println(bundle.getString(message) + result);
    }

    /**
     * Prints several messages.
     *
     * @param messages messages to print
     */
    public void printMessages(String ... messages){
        for (String message : messages)
            System.out.println(bundle.getString(message));
    }

    public void printConferenceInfo(Conference conference) {
        System.out.println(conference);
        conference.getActivities().forEach(System.out::println);
    }
}
