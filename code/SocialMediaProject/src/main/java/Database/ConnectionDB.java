package Database;

import java.sql.*;

public class ConnectionDB {
    final static String HOST_NAME = "localhost";
    final static String PORT = "3306";
    final static String DATABASE_NAME = "database_social";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    static String url = "jdbc:mysql://"+HOST_NAME+":"+PORT+"/"+DATABASE_NAME+"?useUnicode=true&characterEncoding=utf-16";
    static Connection connection;

    public static Statement connect() throws ClassNotFoundException, SQLException {
        if (connection == null || connection.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,
                    USERNAME, PASSWORD);
        }
        return connection.createStatement();
    }

    public static PreparedStatement connect(String sql) throws ClassNotFoundException, SQLException {
        if (connection == null || connection.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,
                    USERNAME, PASSWORD);
        }
        return connection.prepareStatement(sql);
    }

    public static void closeConnection() throws SQLException {
        if (!connection.isClosed())
            connection.close();
    }

}