package com.dicoding.javafundamental.lima;

public class Main {

    public static void main(String[] args) {
	    BankAccount b1 = new BankAccount();
	    BankAccount b2 = new BankAccount();
	    BankAccount b3 = b1;

	    b1.print();
	    b2.print();
	    b3.print();

	    b1.deposit(1000);
	    b2.deposit(500);
	    b3.deposit(100);

	    b1.transfer(700,b2);
	    b2.transfer(400,b3);
        System.out.println("--==== Setelah deposit dan transfer ====--");

        b1.print();
        b2.print();
        b3.print();
    }
}
