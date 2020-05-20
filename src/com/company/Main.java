package com.company;

import java.sql.*;

public class Main<control> {

    public static void main(String[] args) {
        // Create  Your Bank
        Bank khartoumBank = new Bank("Khartoum") ;
        // Show Welcoming screen
        ConsoleController.showMenu(khartoumBank.getBankName());
        // Get what customer need to Throws Exception
        int option =  ConsoleController.getOption();
        // Run Bank all operations depend on what customer Need
        khartoumBank.operations(option);

    }
}
