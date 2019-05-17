package model.dao.impl;

import model.dao.ReportDAO;
import model.entity.Conference;
import model.entity.Report;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCReportDAO implements ReportDAO {
    private Connection connection;

    public JDBCReportDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Report entity) {

    }

    @Override
    public Report findById(int id) {
        Report result = new Report();
        try (Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery("select * from reports where reports.id = " + id);
            if (rs.next())
                result = extractReportFromResultSet(rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private Report extractReportFromResultSet(ResultSet rs) throws SQLException {
        Report result = new Report();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
        result.setDuration(rs.getInt("duration"));
        return result;
    }

    @Override
    public List<Report> findAll() {
        return null;
    }

    @Override
    public void update(Report entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
