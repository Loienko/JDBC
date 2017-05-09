package net.ukr.dreamsicle.ApartmensDataBase;


import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.Scanner;

import static net.ukr.dreamsicle.ApartmensDataBase.ApartmentsView.*;

/**
 * Created by Yura on 09.05.2017.
 */
public class Apartments {
    private static final String HOST = "jdbc:mysql://localhost:3306/Apartments";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    static Connection connection;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            try {
                Driver driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);

                connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
                if (!connection.isClosed()){
                    System.out.println("The DB connection is established");
                }
                initDB();

                while (true) {
                    System.out.println();
                    System.out.println("1: get the apartment by a id");
                    System.out.println("2: get the apartment by a district");
                    System.out.println("3: get the apartment by a address");
                    System.out.println("4: get the apartment by a area");
                    System.out.println("5: get the apartment by a rooms");
                    System.out.println("6: get the apartment by a price");
                    System.out.println("7: get the apartment by a all paremeters");
                    System.out.println("If you want to exit, please press enter");
                    System.out.print("-> ");
                    System.out.println();

                    String s = scanner.nextLine();
                    switch (s) {
                        case "1":
                            viewApartmentById();
                            break;
                        case "2":
                            viewApartmentByDistrict();
                            break;
                        case "3":
                            viewApartmentByAddress();
                            break;
                        case "4":
                            viewApartmentByArea();
                            break;
                        case "5":
                            viewApartmentByRooms();
                            break;
                        case "6":
                            viewApartmentByPrice();
                            break;
                        case "7":
                            viewAllApartment();
                            break;
                        default:
                            return;
                    }
                }

            } finally {
                scanner.close();
                connection.close();
                if (connection.isClosed()){
                    System.out.println("The connection to the database is closed");
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void initDB(){
        try (Statement statement = connection.createStatement()){
            statement.execute("DROP TABLE IF EXISTS Apartments");
            statement.execute("CREATE TABLE Apartments (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, district VARCHAR(40), " +
                    "address VARCHAR(40), area INT, rooms INT, price INT)" );
            addApartment();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addApartment() {
        try (Statement statement = connection.createStatement()){
            statement.execute("INSERT INTO Apartments(district, address, area, rooms, price) VALUES ('Shevchenkivskyj', 'Shcherbakova st. 15', 56, 2, 45000);");
            statement.execute("INSERT INTO Apartments(district, address, area, rooms, price) VALUES ('Svyatoshinskiy', 'Tupoleva st. 18', 45, 2, 55000);");
            statement.execute("INSERT INTO Apartments(district, address, area, rooms, price) VALUES ('Darnitskiy', 'Sportivna st. 26', 40, 1, 65000);");
            statement.execute("INSERT INTO Apartments(district, address, area, rooms, price) VALUES ('Podolsk', 'Drugbi st. 99', 35, 2, 75000);");
            statement.execute("INSERT INTO Apartments(district, address, area, rooms, price) VALUES ('Goloseevsky', 'Puschkina st. 10', 80, 3, 85000);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
