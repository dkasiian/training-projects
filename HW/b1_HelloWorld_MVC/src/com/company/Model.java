package com.company;

public class Model {
    private String firstValue;
    private String secondValue;

    public String getJoinedValue() {
        return firstValue + " " + secondValue;
    }

    public void setFirstValue(String value) {
        this.firstValue = value;
    }

    public void setSecondValue(String value) {
        this.secondValue = value;
    }
}
