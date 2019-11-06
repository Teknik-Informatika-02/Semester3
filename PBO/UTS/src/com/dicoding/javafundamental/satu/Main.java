package com.dicoding.javafundamental.satu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x = 0;
	    int y = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer : ");
        x = in.nextInt();
        System.out.print("Please enter another integer : ");
        x = in.nextInt();
        System.out.println("The sum is " + (x+y));
    }
}
