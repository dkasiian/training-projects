package model.service;

import model.dao.ConferenceDAO;
import model.entity.Conference;

public class MakeConferenceService{
    public Conference makeConference(ConferenceDAO conferenceDAO, int id) {
        return conferenceDAO.findById(id);
    }
}
