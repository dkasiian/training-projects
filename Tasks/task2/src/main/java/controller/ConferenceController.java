package controller;

import model.entities.Conference;
import model.entities.Report;
import config.ConferenceFactory;
import repository.ReportsDB;
import service.CoffeeBreakChangeService;
import service.InputService;
import service.RestChangeService;
import service.ReportChangeService;
import view.View;

import java.util.stream.IntStream;

public class ConferenceController {
    private View view;
    private ReportChangeService reportChangeService;
    private RestChangeService restChangeService;
    private CoffeeBreakChangeService coffeeBreakChangeService;
    private InputService inputService;

    public ConferenceController(View view,
                                ReportChangeService reportChangeService,
                                RestChangeService restChangeService,
                                CoffeeBreakChangeService coffeeBreakChangeService,
                                InputService inputService) {
        this.view = view;
        this.reportChangeService = reportChangeService;
        this.restChangeService = restChangeService;
        this.coffeeBreakChangeService = coffeeBreakChangeService;
        this.inputService = inputService;
    }

    public void process(){
        Conference conference = inputService.makeConferenceByChoice();
        view.printConferenceInfo(conference);

        int reportIndex = getReportIndex(conference, ReportsDB.JAVA11.getReportName());
        Report oldReport = conference.getReports().get(reportIndex);
        Report newReport = ConferenceFactory.getReport(ReportsDB.JAVA12);

        reportChangeService.reportChange(conference.getReports(), oldReport, newReport);
        restChangeService.restChange(conference.getRests(), oldReport.getReportName(), newReport.getReportName());
        coffeeBreakChangeService.coffeeBreakChange(
                conference.getCoffeeBreaks(),
                oldReport.getReportName(),
                newReport.getReportName()
        );
        view.printConferenceInfo(conference);
    }

    private int getReportIndex(Conference conference, String reportName){
        return IntStream.range(0, conference.getReports().size())
                .filter(i -> conference.getReports().get(i).getReportName().equals(reportName))
                .findFirst()
                .orElse(-1);
    }
}
