package config;

import model.entities.*;
import repository.*;

public class ConferenceFactory {
    public static Conference getConference(ConferenceDB conferenceDB){
        return new Conference(
                conferenceDB.getConferenceName(),
                conferenceDB.getReports(),
                conferenceDB.getRests(),
                conferenceDB.getCoffeeBreaks()
        );
    }

    public static Report getReport(ReportsDB reportDBName){
        return new Report(
                reportDBName.getSpeakerName(),
                reportDBName.getReportName(),
                reportDBName.getText()
        );
    }
}
