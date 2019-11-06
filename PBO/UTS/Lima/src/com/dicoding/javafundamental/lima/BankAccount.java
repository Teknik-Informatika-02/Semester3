package com.dicoding.javafundamental.lima;

public class BankAccount {
    private double balance;
    private String accName;

    public BankAccount(){
        this.balance = 0;
        this.accName = "Fulan";
    }

    public BankAccount(String name){
        this.balance = 0;
        this.accName = name;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void print(){
        System.out.println("Rekening milik : " + this.accName);
        System.out.println("Saldo : " + this.getBalance());
    }

    public void transfer(double amount, BankAccount dest){
        this.balance -= amount;
        dest.deposit(amount);
    }
}
