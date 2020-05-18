package com.company;

public interface BankingServices {
     public int checkBalance();
    public int withdraw(int amount );
    public boolean checkIfCustomerExists(int id );
    public int deposit (int amount);
    public void UpdateCustomerName(String name);
    public void UpdateCustomerPhone(String phone);
    public void UpdateCustomerAddress(String address);
}
