package repository;

import config.ConferenceFactory;
import model.RestLength;
import model.entities.CoffeeBreak;
import model.entities.Report;
import model.entities.Rest;

import java.util.ArrayList;
import java.util.List;

public enum ConferenceDB {
    JAVA_DAY_KYIV_2019 (
            "JavaDay Kyiv 2019",
            new ArrayList<>() {{
                add(ConferenceFactory.getReport(ReportsDB.JAVA8));
                add(ConferenceFactory.getReport(ReportsDB.JAVA9));
                add(ConferenceFactory.getReport(ReportsDB.JAVA10));
                add(ConferenceFactory.getReport(ReportsDB.JAVA11));
            }},
            new ArrayList<>() {{
                add(new Rest("Java 8", RestLength.SHORT));
                add(new Rest("Java 9", RestLength.SHORT));
                add(new Rest("Java 10", RestLength.LONG));
            }},
            new ArrayList<>(){{
                add(new CoffeeBreak("Java 11", 50));
            }}
    ),
    JAVA_DAY_LVIV_2019 (
            "JavaDay Lviv 2019",
            new ArrayList<>() {{
                add(ConferenceFactory.getReport(ReportsDB.JAVA8));
                add(ConferenceFactory.getReport(ReportsDB.JAVA10));
                add(ConferenceFactory.getReport(ReportsDB.JAVA11));
            }},
            new ArrayList<>() {{
                add(new Rest("Java 8", RestLength.SHORT));
            }},
            new ArrayList<>(){{
                add(new CoffeeBreak("Java 10", 30));
            }}
    ),
    JAVA_DAY_ODESA_2019 (
            "JavaDay Odesa 2019",
            new ArrayList<>() {{
                add(ConferenceFactory.getReport(ReportsDB.JAVA8));
                add(ConferenceFactory.getReport(ReportsDB.JAVA9));
                add(ConferenceFactory.getReport(ReportsDB.JAVA11));
            }},
            new ArrayList<>() {{
                add(new Rest("Java 9", RestLength.SHORT));
            }},
            new ArrayList<>(){{
                add(new CoffeeBreak("Java 8", 25));
            }}
    );

    private String conferenceName;
    private List<Report> reports;
    private List<Rest> rests;
    private List<CoffeeBreak> coffeeBreaks;

    ConferenceDB(String conferenceName, List<Report> reports, List<Rest> rests, List<CoffeeBreak> coffeeBreaks) {
        this.conferenceName = conferenceName;
        this.reports = reports;
        this.rests = rests;
        this.coffeeBreaks = coffeeBreaks;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public List<Report> getReports() {
        return reports;
    }

    public List<Rest> getRests() {
        return rests;
    }

    public List<CoffeeBreak> getCoffeeBreaks() {
        return coffeeBreaks;
    }
}
