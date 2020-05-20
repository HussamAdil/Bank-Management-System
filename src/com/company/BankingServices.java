package com.company;

public interface BankingServices {
     public int checkBalance();
    public int withdraw(int amount );
    public void checkIfCustomerExists( );
    public int deposit (int amount);
    public void UpdateCustomerName();
    public void UpdateCustomerPhone();
    public void UpdateCustomerAddress();
    public void deleteCustomer();
}
