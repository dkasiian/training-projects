package view;

import model.entities.CoffeeBreak;
import model.entities.Conference;
import model.entities.Report;
import model.entities.Rest;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static String MESSAGES_BUNDLE_NAME = "messages";
    private static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
//            new Locale("ua", "UA"));   // Ukrainian
            new Locale("en"));        // English

    /**
     * Prints one message.
     *
     * @param message message to print
     */
    public void printMessage(String message){
        System.out.println(bundle.getString(message));
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

    public void printConferenceInfo(Conference conference){
        StringBuilder conferenceInfo = new StringBuilder();

        conferenceInfo.append("Reports: ");
        for (Report report : conference.getReports()){
            conferenceInfo.append(report.getReportName())
                    .append(", ")
                    .append(report.getSpeakerName())
                    .append(", ")
                    .append(report.getText())
                    .append("; ");
        }
        conferenceInfo.append("\nRests: ");
        for (Rest rest: conference.getRests()){
            conferenceInfo.append(rest.getAfterReportName())
                    .append(", ")
                    .append(rest.getMinutes())
                    .append("; ");
        }
        conferenceInfo.append("\nCoffee breaks: ");
        for (CoffeeBreak coffeeBreak : conference.getCoffeeBreaks()){
            conferenceInfo.append(coffeeBreak.getAfterReportName())
                    .append(", ")
                    .append(coffeeBreak.getCupsNumber())
                    .append("; ");
        }

        System.out.println(conferenceInfo);
    }
}
