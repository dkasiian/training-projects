package model.entities;


import model.RestLength;

public class Rest {
    private String afterReportName;
    private RestLength minutes;

    public Rest(String afterReportName, RestLength minutes) {
        this.afterReportName = afterReportName;
        this.minutes = minutes;
    }

    public String getAfterReportName() {
        return afterReportName;
    }

    public RestLength getMinutes() {
        return minutes;
    }
}
