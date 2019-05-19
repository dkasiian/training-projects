package controller;

import model.dao.ConferenceDAO;
import model.dao.DAOFactory;
import model.dao.ReportDAO;
import model.entity.Conference;
import model.service.*;
import view.View;

import static view.MessageConstants.*;

public class ConferenceController {
    private View view;

    public ConferenceController(View view){
        this.view = view;
    }

    public void process(){
        DAOFactory factory = DAOFactory.getInstance();
        ConferenceDAO conferenceDao = factory.createConferenceDao();
        ReportDAO reportDAO = factory.createReportDao();

        Conference conference = ServiceFabric.getMakeConferenceService().makeConference(conferenceDao,1);
        servicesCalls(conference);

        ServiceFabric.getReportChangeService().reportChange(conference, reportDAO.findById(1), reportDAO.findById(4));
        view.printConferenceInfo(conference);

        conference = ServiceFabric.getMakeConferenceService().makeConference(conferenceDao,2);
        servicesCalls(conference);
    }

    private void servicesCalls(Conference conference) {
        System.out.println();
        view.printConferenceInfo(conference);
        view.printIntResult(
                OUTPUT_CONFERENCE_DURATION,
                ServiceFabric.getConferenceDurationService().conferenceDuration(conference));
        view.printIntResult(
                OUTPUT_REPORTS_NUMBER,
                ServiceFabric.getReportsNumberService().getReportsNumber(conference));
        view.printIntResult(
                OUTPUT_RESTS_NUMBER,
                ServiceFabric.getRestsNumberService().getRestsNumber(conference));
        view.printIntResult(
                OUTPUT_COFFEES_NUMBER,
                ServiceFabric.getCoffeeBreaksNumberService().getCoffeeBreaksNumber(conference));
        System.out.println();
    }
}
