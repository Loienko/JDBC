package net.ukr.dreamsicle.OrdersDataBase.CreateNewTable;

import java.sql.SQLException;
import java.sql.Statement;

import static net.ukr.dreamsicle.OrdersDataBase.DBWorker.connection;

/**
 * Created by Yura on 09.05.2017.
 */
public class CreateNewTable {

    public static Statement statement;

    public static void initClientTable() {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS clientTable");
            statement.execute("CREATE TABLE clientTable (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(40), " +
                    "city VARCHAR(40), phone INT)" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initProductTable() {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS productTable");
            statement.execute("CREATE TABLE productTable (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(40), " +
                    " price INT)" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initOrderTable() {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS orderTable");
            statement.execute("CREATE TABLE orderTable (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, date VARCHAR(40), " +
                    " orderId INT)" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initAllDB() {
        initClientTable();
        initProductTable();
        initOrderTable();
    }
}
