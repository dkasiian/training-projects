package controller;

import model.dao.ConferenceDAO;
import model.dao.DAOFactory;
import model.entity.Conference;
import model.service.*;
import view.View;

import static view.MessageConstants.*;

public class ConferenceController {
    private View view;
    private MakeConferenceService makeConferenceService;
    private ConferenceDurationService conferenceDurationService;
    private ReportsNumberService reportsNumberService;
    private RestsNumberService restsNumberServiceimpl;
    private CoffeeBreaksNumberService coffeeBreaksNumberService;

    public ConferenceController(View view,
                                MakeConferenceService makeConferenceService,
                                ConferenceDurationService conferenceDurationService,
                                ReportsNumberService reportsNumberService,
                                RestsNumberService restsNumberServiceimpl,
                                CoffeeBreaksNumberService coffeeBreaksNumberService) {
        this.view = view;
        this.makeConferenceService = makeConferenceService;
        this.conferenceDurationService = conferenceDurationService;
        this.reportsNumberService = reportsNumberService;
        this.restsNumberServiceimpl = restsNumberServiceimpl;
        this.coffeeBreaksNumberService = coffeeBreaksNumberService;
    }


    public void process(){
        DAOFactory factory = DAOFactory.getInstance();
        ConferenceDAO conferenceDao = factory.createConferenceDao();

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
