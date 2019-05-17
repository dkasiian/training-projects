package model.dao.impl;

import model.dao.RestDAO;
import model.entity.Rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class JDBCRestDAO implements RestDAO {
    private Connection connection;

    JDBCRestDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Rest entity) {

    }

    @Override
    public Rest findById(int id) {
        Rest result = new Rest();
        try (Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery("select * from rests where rests.id = " + id);
            if (rs.next())
                result = JDBCUtility.extractRestFromResultSet(rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public List<Rest> findAll() {
        return null;
    }

    @Override
    public void update(Rest entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
