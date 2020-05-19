package com.company;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class  Bank {
    private String name;
    public Scanner scanner = new Scanner(System.in);
    String connectionUrl = "jdbc:mysql://127.0.0.1:3306/bankCustomer";


    public Bank(String name )  {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void createAccount()
    {
         try {
            //  int id , String name , String address , String phone,int balance
             System.out.println("Enter account  Id ? ");
            int id = scanner.nextInt();
            System.out.println("Enter customer name  ? ");
            String name = scanner.next();
            System.out.println("Enter customer address  ? ");
            String address = scanner.next();
            System.out.println("Enter customer phone  ? ");
            String phone = scanner.next();
            System.out.println("Enter customer balance  ? ");
            int balance = scanner.nextInt();

             Connection dbconnection;

             {
                 try {
                     dbconnection = DriverManager.getConnection(connectionUrl, "root", "");
                     // create a statement object to send to database
                     Statement statement = dbconnection.createStatement();

                     String insertQuery = "insert into customer  (name,address,phone,balance)" + " values (?,?,?,?)";
                      PreparedStatement preparedStatement = dbconnection.prepareStatement(insertQuery);
                      preparedStatement.setString(1,name);
                     preparedStatement.setString(2,address);
                     preparedStatement.setString(3,phone);
                     preparedStatement.setInt(4,balance);
                     preparedStatement.executeUpdate();
                     preparedStatement.close();
                     int result = statement.executeUpdate(insertQuery);
                     if (result == 1) {
                         System.out.println(result);
                     }
                 } catch (SQLException throwables) {
                     throwables.getStackTrace();
                 }
             }
            System.out.println(" New Customer Created by Id " + id);
        }catch(InputMismatchException e )
        {
            System.out.println("Sorry input mismatch !");
        }
    }
    public  void operations (int option)
    {
        switch (option)
        {
            case 1 :
                createAccount();
        }
    }

}
