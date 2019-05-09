package model;

import java.util.List;

class Conference {
    private List<Report> reports;
    private List<Rest> rests;
    private List<CoffeeBreak> coffeeBreaks;

    Conference(List<Report> reports, List<Rest> rests, List<CoffeeBreak> coffeeBreaks) {
        this.reports = reports;
        this.rests = rests;
        this.coffeeBreaks = coffeeBreaks;
    }

    void reportChange(Report oldReport, Report newReport){
        reports.set(reports.indexOf(oldReport), newReport);
    }

    List<Report> getReports() {
        return reports;
    }

    List<Rest> getRests() {
        return rests;
    }

    List<CoffeeBreak> getCoffeeBreaks() {
        return coffeeBreaks;
    }
}
