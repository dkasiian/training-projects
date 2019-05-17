package model.dao.impl;

import model.dao.CoffeeBreakDAO;
import model.entity.CoffeeBreak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class JDBCCoffeeBreakDAO implements CoffeeBreakDAO {
    private Connection connection;

    JDBCCoffeeBreakDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(CoffeeBreak entity) {

    }

    @Override
    public CoffeeBreak findById(int id) {
        CoffeeBreak result = new CoffeeBreak();
        try (Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery("select * from coffee_breaks where coffee_breaks.id = " + id);
            if (rs.next())
                result = JDBCUtility.extractCoffeeBreakFromResultSet(rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public List<CoffeeBreak> findAll() {
        return null;
    }

    @Override
    public void update(CoffeeBreak entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
