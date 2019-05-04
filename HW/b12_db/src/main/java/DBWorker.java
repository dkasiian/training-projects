import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBWorker {
    private static final String URL = "jdbc:mariadb://localhost:3306/ctech";
    private static final String USER = "root";
    private static final String PASS = "DKasiian27$root";

    private Connection connection;

    DBWorker(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    Connection getConnection() {
        return connection;
    }
}
