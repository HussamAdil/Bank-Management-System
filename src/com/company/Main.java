package com.company;

import java.sql.*;

public class Main<control> {

    public static void main(String[] args) {
//        // Show Welcoming screen
//        ConsoleController.showMenu();
//        // Get what customer need to Throws Exception
//        int option =  ConsoleController.getOption();
//        // Create  Your Bank
//        Bank KhartoumBank = new Bank("Khartoum") ;
//        // Run Bank all operations depend on what customer Need
//        KhartoumBank.operations(option);

        String connectionUrl = "jdbc:mysql://127.0.0.1:3306/bankCustomer";

        Connection dbconnection;

        {
            try {
                dbconnection = DriverManager.getConnection(connectionUrl, "root", "");
                // create a statement object to send to database
                Statement statement = dbconnection.createStatement();
                ResultSet result = statement.executeQuery(" select * from customer ");
                while (result.next()) {
                  System.out.println(result.getString("name"));
                }
            } catch (SQLException throwables) {
                throwables.getStackTrace();
            }
        }


    }
}
