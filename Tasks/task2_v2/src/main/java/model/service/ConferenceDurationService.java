package model.service;

import model.entity.Activity;
import model.entity.Conference;

public class ConferenceDurationService {
    public int conferenceDuration(Conference conference) {
        return conference.getActivities().stream().mapToInt(Activity::getDuration).sum();
    }
}
