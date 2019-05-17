package model.service;

import model.dao.ConferenceDAO;
import model.entity.Conference;

public interface MakeConferenceService {
    Conference makeConference(ConferenceDAO conferenceDAO, int id);
}
