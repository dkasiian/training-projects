package model.service;

import model.entity.CoffeeBreak;
import model.entity.Conference;

public class CoffeeBreaksNumberService {
    public int getCoffeeBreaksNumber(Conference conference) {
        return (int) conference.getActivities().stream().filter(activity -> activity instanceof CoffeeBreak).count();
    }
}
