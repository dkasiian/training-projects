package model.service;

import model.entity.Conference;
import model.entity.Report;

import static java.util.stream.Collectors.toList;

public class ReportChangeService {
    public void reportChange(Conference conference, Report oldReport, Report newReport) {
        conference.setActivities(conference.getActivities().stream()
                .map(activity -> activity.getId() == oldReport.getId() &&
                        activity.getName().equals(oldReport.getName())? newReport : activity)
                .collect(toList()));
    }
}
