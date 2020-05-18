package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleController {
    public static void showMenu()
    {
        System.out.println(" ------------------------ ");
        System.out.println(" [  Welcome Dear Customer ] ");
        System.out.println(" ------------------------ ");
        System.out.println(" Select from the menu :  ");
        System.out.println(" 1 - Create new account.");
        System.out.println(" 2 - Update information of exiting account.");
        System.out.println(" 3 - Withdraw for account.");
        System.out.println(" 4 - Check If the customer exits");
        System.out.println(" 5 - Delete account.");
        System.out.print(" Select : ");
    }
    public static int getOption()
    {
        int option =  0 ;
        Scanner scanner = new Scanner(System.in);
        try {
              option = scanner.nextInt();
         }catch(InputMismatchException e )
        {
            System.out.println("Sorry !");
        }
        return option;
    }

}
