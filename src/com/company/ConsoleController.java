package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleController {

    public static void showMenu(String BankName)
    {
        System.out.println(" ------------------------ ");
        System.out.println("  Welcome to " + BankName + " Bank" );
        System.out.println(" ------------------------ ");
        System.out.println(" Select from the menu :  ");
        System.out.println(" 1 - Create new account.");
        System.out.println(" 2 - Delete Customer.");
        System.out.println(" 3 - Check If Customer Exists.");
        System.out.println(" 4 - Update Customer Information ");
        System.out.println(" 5 - Withdraw  ");
        System.out.println(" 6 - Check Customer Balance ");
        System.out.println(" 7 - Deposit");
        System.out.println(" 8 - Exit");
        System.out.println(" Your select  : ");
    }
    public static int getOption()
    {
        int option =  0 ;
        Scanner scanner = new Scanner(System.in);
        try {
              option = scanner.nextInt();
         }catch(InputMismatchException e )
        {
            System.out.println("Sorry input mismatch!");
        }
        return option;
    }
    // reshow console screen to customer
    public static   void reShowMenu(String BankName)
    {
       Bank bank =  new Bank(BankName);
        // Show Welcoming screen
        ConsoleController.showMenu(bank.getBankName());
        // Get what customer need
        int option =  ConsoleController.getOption();
        bank.operations(option);
    }

    public static void  sleepAndReShowMenu(String bankName)  {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e )
        {
            e.getMessage();
        }
        ConsoleController.reShowMenu(bankName);
    }
}
