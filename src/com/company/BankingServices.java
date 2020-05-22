package com.company;

public interface BankingServices {
     public void checkBalance();
    public void withdraw();
    public void checkIfCustomerExists( );
    public int deposit (int amount);
    public void updateCustomerInformation();
    public void updateCustomerName();
    public void updateCustomerPhone();
    public void updateCustomerAddress();
    public void deleteCustomer();
}
