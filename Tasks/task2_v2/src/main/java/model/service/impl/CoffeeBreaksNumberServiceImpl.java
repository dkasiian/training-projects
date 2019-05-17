package model.service.impl;

import model.entity.CoffeeBreak;
import model.entity.Conference;
import model.service.CoffeeBreaksNumberService;

public class CoffeeBreaksNumberServiceImpl implements CoffeeBreaksNumberService {
    @Override
    public int getCoffeeBreaksNumber(Conference conference) {
        return (int) conference.getActivities().stream().filter(activity -> activity instanceof CoffeeBreak).count();
    }
}
