import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "SELECT * FROM news";

        try (Statement statement = worker.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){

                String header = resultSet.getString("n_header");
                System.out.println(header);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
