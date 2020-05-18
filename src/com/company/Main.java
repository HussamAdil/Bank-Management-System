package com.company;
public class Main<control> {

    public static void main(String[] args) {
        // Show Welcoming screen
        ConsoleController.showMenu();
        // Get what customer need to Throws Exception
        int option =  ConsoleController.getOption();
        // Create  Your Bank
        Bank KhartoumBank = new Bank("Khartoum") ;
        // Run Bank all operations depend on what customer Need
        KhartoumBank.operations(option);
    }
}
