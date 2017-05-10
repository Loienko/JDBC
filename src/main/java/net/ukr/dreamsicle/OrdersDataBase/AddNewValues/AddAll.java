package net.ukr.dreamsicle.OrdersDataBase.AddNewValues;

import java.sql.*;
import java.util.Scanner;

import static net.ukr.dreamsicle.OrdersDataBase.DBWorker.connection;

/**
 * Created by Yura on 09.05.2017.
 */
public class AddAll {

    public static void addNewClient(Scanner scanner) throws SQLException {
        System.out.print("Input client name: ");
        String name = scanner.nextLine();
        System.out.print("Input client city: ");
        String city = scanner.nextLine();
        System.out.println("Input client phone: ");
        String sPhone = scanner.nextLine();
        int phone = Integer.parseInt(sPhone);

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO clienttable (name, city, phone) VALUES(?, ?, ?)");
        try {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, city);
            preparedStatement.setInt(3, phone);
            preparedStatement.executeUpdate();
        } finally {
            preparedStatement.close();
        }
    }

    public static void addNewProduct(Scanner scanner) throws SQLException {
        System.out.print("Input product name: ");
        String name = scanner.nextLine();
        System.out.print("Input product price: ");
        String sPrice = scanner.nextLine();
        int price = Integer.parseInt(sPrice);


        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO producttable (name, price) VALUES(?, ?)");
        try {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, price);

            preparedStatement.executeUpdate();
        } finally {
            preparedStatement.close();
        }
    }

    public static void addNewOrder(Scanner scanner) throws SQLException {
        System.out.print("Input order date: ");
        String sDate = scanner.nextLine();
        int date = Integer.parseInt(sDate);
        System.out.print("Input order ID: ");
        String sOrderId = scanner.nextLine();
        int orderId = Integer.parseInt(sOrderId);

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ordertable (date, orderId) VALUES(?, ?)");
        try {
            preparedStatement.setInt(1, date);
            preparedStatement.setInt(2, orderId);
            preparedStatement.executeUpdate();
        } finally {
            preparedStatement.close();
        }


    }
}
