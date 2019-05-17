package model.service.impl;

import model.entity.Activity;
import model.entity.Conference;
import model.service.ConferenceDurationService;

public class ConferenceDurationServiceImpl implements ConferenceDurationService {
    @Override
    public int conferenceDuration(Conference conference) {
        return conference.getActivities().stream().mapToInt(Activity::getDuration).sum();
    }
}
