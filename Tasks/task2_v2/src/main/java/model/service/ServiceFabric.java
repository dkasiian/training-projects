package model.service;

public class ServiceFabric {
    public static MakeConferenceService getMakeConferenceService() {
        return new MakeConferenceService();
    }

    public static ConferenceDurationService getConferenceDurationService() {
        return new ConferenceDurationService();
    }

    public static ReportsNumberService getReportsNumberService() {
        return new ReportsNumberService();
    }

    public static RestsNumberService getRestsNumberService() {
        return new RestsNumberService();
    }

    public static CoffeeBreaksNumberService getCoffeeBreaksNumberService() {
        return new CoffeeBreaksNumberService();
    }

    public static ReportChangeService getReportChangeService() {
        return new ReportChangeService();
    }
}
