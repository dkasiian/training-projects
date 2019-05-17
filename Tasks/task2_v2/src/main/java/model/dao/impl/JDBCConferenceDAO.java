package model.dao.impl;

import model.dao.ConferenceDAO;
import model.entity.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCConferenceDAO implements ConferenceDAO {
    private Connection connection;

    JDBCConferenceDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Conference entity) {

    }

    @Override
    public Conference findById(int id) {
        Conference conference = new Conference();
        List<Activity> activities = new ArrayList<>();
        ResultSet rs;
        try (Statement statement = connection.createStatement()){
            rs = statement.executeQuery("select * from conferences where conferences.id = " + id);
            while (rs.next())
                conference = JDBCUtility.extractConferenceFromResultSet(rs);

            rs = statement.executeQuery(
                    "select reports.id, reports.name, reports.duration from reports, conferences_reports where conferences_reports.conference_id = " + id +
                            " AND conferences_reports.report_id = reports.id");
            while ( rs.next() )
                activities.add(JDBCUtility.extractReportFromResultSet(rs));

            rs = statement.executeQuery(
                    "select rests.id, rests.type, rests.duration, conferences_rests.rest_number from rests, conferences_rests where conferences_rests.conference_id = " + id +
                            " AND conferences_rests.rest_id = rests.id");
            while ( rs.next() )
                for (int i = 0; i < rs.getInt("rest_number"); i++)
                    activities.add(JDBCUtility.extractRestFromResultSet(rs));

            rs = statement.executeQuery(
                    "select coffee_breaks.id, coffee_breaks.type, coffee_breaks.duration, conferences_coffeebreaks.coffeebreak_number from coffee_breaks, conferences_coffeebreaks where conferences_coffeebreaks.conference_id = " + id +
                            " AND conferences_coffeebreaks.coffeebreak_id = coffee_breaks.id");
            while ( rs.next() )
                for (int i = 0; i < rs.getInt("coffeebreak_number"); i++)
                    activities.add(JDBCUtility.extractCoffeeBreakFromResultSet(rs));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        conference.setActivities(activities);
        return conference;
    }

    @Override
    public List<Conference> findAll() {
        return null;
    }

    @Override
    public void update(Conference entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
