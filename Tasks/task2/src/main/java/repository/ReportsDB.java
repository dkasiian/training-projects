package repository;

public enum ReportsDB {
    JAVA8("Alex", "Java 8", "Some text"),
    JAVA9("Oliver", "Java 9", "Some text"),
    JAVA10("Steve", "Java 10", "Some text"),
    JAVA11("Mark", "Java 11", "Some text"),
    JAVA12("Donald", "Java 12", "Some text");

    private String speakerName;
    private String reportName;
    private String text;

    ReportsDB(String speakerName, String reportName, String text) {
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
