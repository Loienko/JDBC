package net.ukr.dreamsicle.OrdersDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * Created by Yura on 09.05.2017.
 */
public class DBWorker {
    private static final String HOST = "jdbc:mysql://localhost:3306/orderDataBase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "YURAdreamsicle12345";

    public static Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public static void DBWorkerStart() {

        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
            if (!connection.isClosed()){
                System.out.println("The DB connection is established");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void DBWorkerStop(){
        try {
            //statement.close();
            connection.close();
            if (connection.isClosed()){
                System.out.println("The connection to the database is closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
