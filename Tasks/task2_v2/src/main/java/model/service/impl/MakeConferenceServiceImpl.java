package model.service.impl;

import model.dao.ConferenceDAO;
import model.entity.Conference;
import model.service.MakeConferenceService;

public class MakeConferenceServiceImpl implements MakeConferenceService {
    @Override
    public Conference makeConference(ConferenceDAO conferenceDAO, int id) {
        return conferenceDAO.findById(id);
    }
}
