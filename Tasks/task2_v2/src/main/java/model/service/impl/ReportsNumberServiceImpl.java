package model.service.impl;

import model.entity.Conference;
import model.entity.Report;
import model.service.ReportsNumberService;

public class ReportsNumberServiceImpl implements ReportsNumberService {
    @Override
    public int getReportsNumber(Conference conference) {
        return (int) conference.getActivities().stream().filter(activity -> activity instanceof Report).count();
    }
}
