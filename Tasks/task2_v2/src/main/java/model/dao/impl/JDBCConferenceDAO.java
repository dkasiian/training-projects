package model.dao.impl;

import model.dao.ConferenceDAO;
import model.entity.CoffeeBreak;
import model.entity.Conference;
import model.entity.Report;
import model.entity.Rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        ResultSet rs;
        try (Statement statement = connection.createStatement()){
            rs = statement.executeQuery("select * from conferences where conferences.id = " + id);
            while (rs.next())
                conference = extractConferenceFromResultSet(rs);

            rs = statement.executeQuery(
                    "select reports.id, reports.name, reports.duration from reports, conferences_reports where conferences_reports.conference_id = " + id +
                            " AND conferences_reports.report_id = reports.id");
            while ( rs.next() ){
                conference.getActivities().add(extractReportFromResultSet(rs));
            }

            rs = statement.executeQuery(
                    "select rests.id, rests.type, rests.duration, conferences_rests.rest_number from rests, conferences_rests where conferences_rests.conference_id = " + id +
                            " AND conferences_rests.rest_id = rests.id");
            while ( rs.next() ){
                int rest_number = rs.getInt("rest_number");
                for (int i = 0; i < rest_number; i++)
                    conference.getActivities().add(extractRestFromResultSet(rs));
            }

            rs = statement.executeQuery(
                    "select coffee_breaks.id, coffee_breaks.type, coffee_breaks.duration, conferences_coffeebreaks.coffeebreak_number from coffee_breaks, conferences_coffeebreaks where conferences_coffeebreaks.conference_id = " + id +
                            " AND conferences_coffeebreaks.coffeebreak_id = coffee_breaks.id");
            while ( rs.next() ){
                int cb_number = rs.getInt("coffeebreak_number");
                for (int i = 0; i < cb_number ; i++)
                    conference.getActivities().add(extractCoffeeBreakFromResultSet(rs));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conference;
    }

    private Conference extractConferenceFromResultSet(ResultSet rs) throws SQLException {
        Conference result = new Conference();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
        return result;
    }

    private Report extractReportFromResultSet(ResultSet rs) throws SQLException {
        Report result = new Report();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
        result.setDuration(rs.getInt("duration"));
        return result;
    }

    private Rest extractRestFromResultSet(ResultSet rs) throws SQLException {
        Rest result = new Rest();
        result.setId(rs.getInt("id"));
        result.setType(rs.getString("type"));
        result.setDuration(rs.getInt("duration"));
        return result;
    }

    private CoffeeBreak extractCoffeeBreakFromResultSet(ResultSet rs) throws SQLException {
        CoffeeBreak result = new CoffeeBreak();
        result.setId(rs.getInt("id"));
        result.setType(rs.getString("type"));
        result.setDuration(rs.getInt("duration"));
        return result;
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
