package model.dao.impl;

import model.entity.CoffeeBreak;
import model.entity.Conference;
import model.entity.Report;
import model.entity.Rest;

import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCUtility {
    static Conference extractConferenceFromResultSet(ResultSet rs) throws SQLException {
        Conference result = new Conference();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
        return result;
    }

    static Report extractReportFromResultSet(ResultSet rs) throws SQLException {
        Report result = new Report();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
        result.setDuration(rs.getInt("duration"));
        return result;
    }

    static Rest extractRestFromResultSet(ResultSet rs) throws SQLException {
        Rest result = new Rest();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("type"));
        result.setDuration(rs.getInt("duration"));
        return result;
    }

    static CoffeeBreak extractCoffeeBreakFromResultSet(ResultSet rs) throws SQLException {
        CoffeeBreak result = new CoffeeBreak();
        result.setId(rs.getInt("id"));
        result.setType(rs.getString("type"));
        result.setDuration(rs.getInt("duration"));
        return result;
    }
}
