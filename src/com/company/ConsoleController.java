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
        System.out.println("3 -  Check If Customer Exists");
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
            System.out.println("Sorry !");
        }
        return option;
    }

}
