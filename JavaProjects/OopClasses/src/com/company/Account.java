package com.company;

public class Account {

    private String number;
    private double balance;
    private String custonerName;
    private String custmerPhone;
    private String email;

    public void deposite(double depositeAmount) {
        this.balance += depositeAmount;
        System.out.println("Deposit of " + depositeAmount + " done. New balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Insufficient balance to withdraw " + withdrawalAmount + " your balance is " + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal amount " + withdrawalAmount + " successful. remaining balance " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustonerName() {
        return custonerName;
    }

    public void setCustonerName(String custonerName) {
        this.custonerName = custonerName;
    }

    public String getCustmerPhone() {
        return custmerPhone;
    }

    public void setCustmerPhone(String custmerPhone) {
        this.custmerPhone = custmerPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
