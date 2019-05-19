package model.service;

import model.entity.Conference;
import model.entity.Rest;

public class RestsNumberService {
    public int getRestsNumber(Conference conference){
        return (int) conference.getActivities().stream().filter(activity -> activity instanceof Rest).count();
    }
}
