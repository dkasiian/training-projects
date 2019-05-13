package model.entities;

import java.util.List;

public class Conference {
    private String conferenceName;
    private List<Report> reports;
    private List<Rest> rests;
    private List<CoffeeBreak> coffeeBreaks;

    public Conference(String conferenceName, List<Report> reports, List<Rest> rests, List<CoffeeBreak> coffeeBreaks) {
        this.conferenceName = conferenceName;
        this.reports = reports;
        this.rests = rests;
        this.coffeeBreaks = coffeeBreaks;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public List<Report> getReports() { return reports; }

    public List<Rest> getRests() {
        return rests;
    }

    public List<CoffeeBreak> getCoffeeBreaks() {
        return coffeeBreaks;
    }
}
