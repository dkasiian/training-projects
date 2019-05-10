package model.entities;

public class CoffeeBreak {
    private String afterReportName;
    private int cupsNumber;

    public CoffeeBreak(String afterReportName, int cupsNumber) {
        this.afterReportName = afterReportName;
        this.cupsNumber = cupsNumber;
    }

    public String getAfterReportName() {
        return afterReportName;
    }

    public int getCupsNumber() {
        return cupsNumber;
    }
}
