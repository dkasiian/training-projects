package view;

import model.entities.CoffeeBreak;
import model.entities.Conference;
import model.entities.Report;
import model.entities.Rest;

public class View {
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printConferenceInfo(Conference conference){
        StringBuilder conferenceInfo = new StringBuilder();

        conferenceInfo.append("Reports: ");
        for (Report report : conference.getReports()){
            conferenceInfo.append(report.getReportName() + ", " + report.getSpeakerName() + ", " + report.getText() + "; ");
        }
        conferenceInfo.append("\nRests: ");
        for (Rest rest: conference.getRests()){
            conferenceInfo.append(rest.getAfterReportName() + ", " + rest.getMinutes() + "; ");
        }
        conferenceInfo.append("\nCoffee breaks: ");
        for (CoffeeBreak coffeeBreak : conference.getCoffeeBreaks()){
            conferenceInfo.append(coffeeBreak.getAfterReportName() + ", " + coffeeBreak.getCupsNumber() + "; ");
        }

        System.out.println(conferenceInfo);
    }
}
