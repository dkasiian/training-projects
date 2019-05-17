package controller;

import model.dao.ConferenceDAO;
import model.dao.DAOFactory;
import model.entity.Conference;
import model.service.impl.*;
import view.View;

import static view.MessageConstants.*;

public class ConferenceController {
    private View view;

    public ConferenceController(View view) {
        this.view = view;
    }

    public void process(){
        DAOFactory factory = DAOFactory.getInstance();
        ConferenceDAO conferenceDao = factory.createConferenceDao();

        MakeConferenceServiceImpl makeConferenceService = new MakeConferenceServiceImpl();
        ConferenceDurationServiceImpl conferenceDurationService = new ConferenceDurationServiceImpl();
        ReportsNumberServiceImpl reportsNumberService = new ReportsNumberServiceImpl();
        RestsNumberServiceimpl restsNumberServiceimpl = new RestsNumberServiceimpl();
        CoffeeBreaksNumberServiceImpl coffeeBreaksNumberService = new CoffeeBreaksNumberServiceImpl();

        Conference conference = makeConferenceService.makeConference(conferenceDao,1);
        view.printConferenceInfo(conference);
        view.printIntResult(OUTPUT_CONFERENCE_DURATION, conferenceDurationService.conferenceDuration(conference));
        view.printIntResult(OUTPUT_REPORTS_NUMBER, reportsNumberService.getReportsNumber(conference));
        view.printIntResult(OUTPUT_RESTS_NUMBER, restsNumberServiceimpl.getRestsNumber(conference));
        view.printIntResult(OUTPUT_COFFEES_NUMBER, coffeeBreaksNumberService.getCoffeeBreaksNumber(conference));

        System.out.println();

        conference = makeConferenceService.makeConference(conferenceDao,2);
        view.printConferenceInfo(conference);
        view.printIntResult(OUTPUT_CONFERENCE_DURATION, conferenceDurationService.conferenceDuration(conference));
        view.printIntResult(OUTPUT_REPORTS_NUMBER, reportsNumberService.getReportsNumber(conference));
        view.printIntResult(OUTPUT_RESTS_NUMBER, restsNumberServiceimpl.getRestsNumber(conference));
        view.printIntResult(OUTPUT_COFFEES_NUMBER, coffeeBreaksNumberService.getCoffeeBreaksNumber(conference));
    }
}
