package model;

class Report {
    private String speakerName;
    private String reportName;
    private String tableOfContents;
    private String text;

    Report(String speakerName, String reportName, String tableOfContents, String text) {
        this.speakerName = speakerName;
        this.reportName = reportName;
        this.tableOfContents = tableOfContents;
        this.text = text;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public String getReportName() {
        return reportName;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public String getText() {
        return text;
    }
}
