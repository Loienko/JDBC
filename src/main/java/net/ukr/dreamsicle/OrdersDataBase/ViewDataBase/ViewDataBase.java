package net.ukr.dreamsicle.OrdersDataBase.ViewDataBase;

import net.ukr.dreamsicle.OrdersDataBase.Orders.Client;
import net.ukr.dreamsicle.OrdersDataBase.Orders.Order;
import net.ukr.dreamsicle.OrdersDataBase.Orders.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static net.ukr.dreamsicle.OrdersDataBase.DBWorker.connection;

/**
 * Created by Yura on 09.05.2017.
 */
public class ViewDataBase {

    public static void viewAllClients() {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientTable");

            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setCity(resultSet.getString("city"));
                client.setPhone(resultSet.getInt("phone"));

                System.out.println(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewAllProduct() {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM productTable");

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getInt("price"));

                System.out.println(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewAllOrder() {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM orderTable");

            while (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getInt("id"));
                order.setDate(resultSet.getInt("date"));
                order.setOrderId(resultSet.getInt("orderId"));

                System.out.println(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
