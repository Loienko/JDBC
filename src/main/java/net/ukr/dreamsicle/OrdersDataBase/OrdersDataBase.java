package net.ukr.dreamsicle.OrdersDataBase;


import java.sql.*;
import java.util.*;

import static net.ukr.dreamsicle.OrdersDataBase.AddNewValues.AddAll.addNewClient;
import static net.ukr.dreamsicle.OrdersDataBase.AddNewValues.AddAll.addNewOrder;
import static net.ukr.dreamsicle.OrdersDataBase.AddNewValues.AddAll.addNewProduct;
import static net.ukr.dreamsicle.OrdersDataBase.CreateNewTable.CreateNewTable.initAllDB;
import static net.ukr.dreamsicle.OrdersDataBase.ViewDataBase.ViewDataBase.viewAllClients;
import static net.ukr.dreamsicle.OrdersDataBase.ViewDataBase.ViewDataBase.viewAllOrder;
import static net.ukr.dreamsicle.OrdersDataBase.ViewDataBase.ViewDataBase.viewAllProduct;

/**
 * Created by Yura on 09.05.2017.
 */
public class OrdersDataBase {


    public static void main(String[] args) throws SQLException {

        DBWorker.DBWorkerStart();

        Scanner scanner = new Scanner(System.in);

        initAllDB();

        while (true) {
            System.out.println();
            System.out.println("1: view all clients");
            System.out.println("2: add new client");
            System.out.println("3: view all product");
            System.out.println("4: add new product");
            System.out.println("5: view all order");
            System.out.println("6: add new order");
            System.out.println("If you want to exit, please press enter");
            System.out.print("-> ");
            System.out.println();

            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    viewAllClients();
                    break;
                case "2":
                    addNewClient(scanner);
                    break;
                case "3":
                    viewAllProduct();
                    break;
                case "4":
                    addNewProduct(scanner);
                    break;
                case "5":
                    viewAllOrder();
                    break;
                case "6":
                    addNewOrder(scanner);
                    break;
                default:
                    return;
            }


        }

    }

}
