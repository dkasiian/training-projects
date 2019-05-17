package model.dao.impl;

import model.dao.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DAOFactory {
    @Override
    public ConferenceDAO createConferenceDao() {
        return new JDBCConferenceDAO();
    }

    @Override
    public ReportDAO createReportDao() {
        return new JDBCReportDAO();
    }

    @Override
    public RestDAO createRestDao() {
        return new JDBCRestDAO();
    }

    @Override
    public CoffeeBreakDAO createCoffeeBreakDao() {
        return new JDBCCoffeeBreakDAO();
    }

    private Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task2_conferencedb",
                    "root" ,
                    "DKasiian27$root" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
