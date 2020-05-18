package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  Bank {
    private String name ;
    public Bank(String name )
    {
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
        Scanner scanner = new Scanner(System.in);
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
            Account account = new Account(id,name,address,phone,balance);
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
