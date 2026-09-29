package JDBCLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    private String url = "jdbc:mysql://localhost:3306/jdbclearning";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;
    static{
        try{
            //Load the driver.
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        //Build the connection in between the Java and MySQL.
        connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
}
