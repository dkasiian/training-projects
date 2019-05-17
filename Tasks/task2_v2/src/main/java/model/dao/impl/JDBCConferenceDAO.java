package model.dao.impl;

import model.dao.ConferenceDAO;
import model.entity.Conference;

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
        Conference result = new Conference();
        try (Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery("select * from conferences where conferences.id = " + id);
            if (rs.next())
                result = extractConferenceFromResultSet(rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private Conference extractConferenceFromResultSet(ResultSet rs) throws SQLException {
        Conference result = new Conference();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
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
