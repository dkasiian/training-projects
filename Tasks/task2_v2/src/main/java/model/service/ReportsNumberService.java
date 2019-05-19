package model.service;

import model.entity.Conference;
import model.entity.Report;

public class ReportsNumberService{
    public int getReportsNumber(Conference conference) {
        return (int) conference.getActivities().stream().filter(activity -> activity instanceof Report).count();
    }
}
