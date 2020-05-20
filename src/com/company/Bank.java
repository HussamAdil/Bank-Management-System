package com.company;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class  Bank implements BankingServices  {
    private String name ;
    private String address ;
    private String phone ;
    public int balance ;
    private String  bankName;
    Connection dbconnection;
    public Scanner scanner = new Scanner(System.in);
    String connectionUrl = "jdbc:mysql://127.0.0.1:3306/bankCustomer";
    
    public Bank(String bankName )  {
        setBankName(bankName);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public void createAccount()
    {
         try {
          // String name , String address , String phone,int balance
             System.out.println("Enter customer name  ? ");
            String name = scanner.next();
            System.out.println("Enter customer address  ? ");
            String address = scanner.next();
            System.out.println("Enter customer phone  ? ");
            String phone = scanner.next();
            System.out.println("Enter customer balance  ? ");
            int balance = scanner.nextInt();
             {
                 try {
                     dbconnection = DriverManager.getConnection(connectionUrl, "root", "");
                     // create a statement object to send to database
                     String insertQuery = "insert into customer  (name,address,phone,balance)" + " values (?,?,?,?)";
                      PreparedStatement preparedStatement = dbconnection.prepareStatement(insertQuery);
                     // prepare all data before insert it
                     preparedStatement.setString(1,name);
                     preparedStatement.setString(2,address);
                     preparedStatement.setString(3,phone);
                     preparedStatement.setInt(4,balance);
                    // return 0 if not insert it Or 1 if inserted
                     int result = preparedStatement.executeUpdate();
                     preparedStatement.close();
                     if (result == 1) {
                         System.out.println(" New Customer Created.");
                     }
                 } catch (SQLException throwables) {
                    System.out.println("Can not create new customer database Error ");
                 }
             }

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
               break;
            case 2 :
                deleteCustomer();
        }
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public int withdraw(int amount) {
        if(this.balance <  amount)
            System.out.println("Sorry your balance is less than what you want ");
        return this.balance - amount;
    }

    @Override
    public boolean checkIfCustomerExists(int id) {
        return false;
    }

    @Override
    public int deposit(int amount) {
        return 0;
    }

    @Override
    public void UpdateCustomerName( ) {

        {

            try {
                // String name , String address , String phone,int balance
                System.out.println("Enter customer id   ? ");
                int id = scanner.nextInt();
                System.out.println("Enter new customer name   ? ");
                 String name = scanner.next();
                try {
                    dbconnection = DriverManager.getConnection(connectionUrl, "root", "");
                    // create a statement object to send to database
                    String updateQuery = "update customer set (name) where(id)" + " value (?,?)";
                    PreparedStatement preparedStatement = dbconnection.prepareStatement(updateQuery);
                    // prepare all data before insert it
                    preparedStatement.setInt(1, id);
                    preparedStatement.setString(2, name);
                    // return 0 if not insert it Or 1 if inserted
                    int result = preparedStatement.executeUpdate();
                    preparedStatement.close();
                    if (result == 1) {
                        System.out.println(" Customer name updated");
                    }
                } catch (SQLException throwables) {
                    throwables.getStackTrace();
                }
            } catch (InputMismatchException e)
            {
                e.getMessage();
            }
        }
    }

    @Override
    public void deleteCustomer() {
        {

            try {
                // int id
                System.out.println("Enter customer id   ? ");
                int id = scanner.nextInt();
                try {
                    dbconnection = DriverManager.getConnection(connectionUrl, "root", "");
                    // create a statement object to send to database
                    String deleteQuery  = "delete from customer  where(id) = " + "  (?)";
                    PreparedStatement preparedStatement = dbconnection.prepareStatement(deleteQuery);
                    // prepare all data before insert it
                    preparedStatement.setInt(1, id);
                     // return 0 if not query compete  Or 1 if not
                    int result = preparedStatement.executeUpdate();
                    preparedStatement.close();
                    if (result == 1) {
                        System.out.println(" Customer deleted");
                    }
                } catch (SQLException throwables) {
                    System.out.println("Can't delete customer from database error ");
                }
            } catch (Exception e) {
                System.out.println("Sorry Input error ");
            }
        }
    }
    @Override
    public void UpdateCustomerPhone() {

    }

    @Override
    public void UpdateCustomerAddress() {

    }
}
