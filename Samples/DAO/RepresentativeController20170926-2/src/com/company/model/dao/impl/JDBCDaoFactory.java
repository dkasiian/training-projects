package com.company.model.dao.impl;

import com.company.model.dao.DaoFactory;
import com.company.model.dao.NoteBookDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCDaoFactory extends DaoFactory {
    @Override
    public NoteBookDao createNoteBookDao() {
        return new JDBCNotebookDao(getConnection());
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
