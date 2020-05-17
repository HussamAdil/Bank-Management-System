package com.company;

public class Bank implements BankingServices {
    private String name ;
    private int id ;
    private String address ;
    private String phone ;
    public int balance ;

    public void createAccount( int id , String name , String address , String phone,int balance)
    {
        this.id = id;
        this.name = name ;
        this.address = address ;
        this.phone = phone;
        this.balance = balance;
    }
    public int checkBalance()
    {
        return balance;
    }
    public int withdraw(int amount)
    {
        if(this.balance <  amount)
            System.out.println("Sorry your balance is less than what you want ");
        return this.balance - amount;
    }
    public boolean checkIfCustomerExists(int id )
    {
        return this.id == id;
    }
    public void UpdateCustomerName(String name)
    {
        this.name = name ;
        System.out.println("updated");
    }
    public void UpdateCustomerPhone(String phone)
    {
        this.phone = phone ;
        System.out.println("updated");
    }
    public void UpdateCustomerAddress(String address)
    {
        this.address = address ;
        System.out.println("updated");
    }
    public int deposit (int amount)
    {
        return this.balance + amount ;
    }
}
