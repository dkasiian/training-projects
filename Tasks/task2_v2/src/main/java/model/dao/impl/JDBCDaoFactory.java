package model.dao.impl;

import model.dao.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCDaoFactory extends DAOFactory {
    @Override
    public ConferenceDAO createConferenceDao() {
        return new JDBCConferenceDAO(getConnection());
    }

    @Override
    public ReportDAO createReportDao() {
        return new JDBCReportDAO(getConnection());
    }

    @Override
    public RestDAO createRestDao() {
        return new JDBCRestDAO(getConnection());
    }

    @Override
    public CoffeeBreakDAO createCoffeeBreakDao() {
        return new JDBCCoffeeBreakDAO(getConnection());
    }

    private Connection getConnection(){
        ResourceBundle bundle = ResourceBundle.getBundle("connection");
        try {
            return DriverManager.getConnection(
                    bundle.getString("db.conn.url"),
                    bundle.getString("db.username"),
                    bundle.getString("db.password")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
