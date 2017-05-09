package net.ukr.dreamsicle.ApartmensDataBase;

import javax.management.Query;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static net.ukr.dreamsicle.ApartmensDataBase.Apartments.connection;

/**
 * Created by Yura on 09.05.2017.
 */
public class ApartmentsView {

    public static void viewAllApartment() {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Apartments");

            while (resultSet.next()) {
                Apartment apartment = new Apartment();
                apartment.setId(resultSet.getInt("id"));
                apartment.setDistrict(resultSet.getString("district"));
                apartment.setAddress(resultSet.getString("address"));
                apartment.setArea(resultSet.getInt("area"));
                apartment.setRooms(resultSet.getInt("rooms"));
                apartment.setPrice(resultSet.getInt("price"));

                System.out.println(apartment);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewApartmentById() throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT id FROM Apartments")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id  = resultSet.getInt("id");

                System.out.println("id: " + id);
            }

        }
    }

    public static void viewApartmentByDistrict() throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT district FROM Apartments")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String  district = resultSet.getString("district");

                System.out.println("Price apartment: " + district);
            }

        }
    }

    public static void viewApartmentByAddress() throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT address FROM Apartments")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String  address = resultSet.getString("address");

                System.out.println("Price apartment: " + address);
            }

        }
    }

    public static void viewApartmentByArea() throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT area FROM Apartments")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int area = resultSet.getInt("area");

                System.out.println("Area apartment: " + area);
            }

        }
    }

    public static void viewApartmentByRooms() throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT rooms FROM Apartments")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int rooms = resultSet.getInt("rooms");

                System.out.println("Rooms in the apartment: " + rooms);
            }

        }
    }

    public static void viewApartmentByPrice() throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT district, price FROM Apartments")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String district = resultSet.getString("district");
                int price = resultSet.getInt("price");

                System.out.println("District: " + district + ", Price apartment: " + price);
            }

        }
    }
}
