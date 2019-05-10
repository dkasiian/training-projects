package model.entities;

public class Report {
    private String speakerName;
    private String reportName;
    private String text;

    public Report(String speakerName, String reportName, String text) {
        this.speakerName = speakerName;
        this.reportName = reportName;
        this.text = text;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public String getReportName() {
        return reportName;
    }

    public String getText() {
        return text;
    }
}
