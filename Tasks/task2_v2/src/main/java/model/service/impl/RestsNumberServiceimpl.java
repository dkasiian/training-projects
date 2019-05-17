package model.service.impl;

import model.entity.Conference;
import model.entity.Rest;
import model.service.RestsNumberService;

public class RestsNumberServiceimpl implements RestsNumberService {
    @Override
    public int getRestsNumber(Conference conference) {
        return (int) conference.getActivities().stream().filter(activity -> activity instanceof Rest).count();
    }
}
