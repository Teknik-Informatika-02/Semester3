package com.dicoding.javafundamental.dua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double volume;
        int r;

        Scanner in = new Scanner(System.in);
        System.out.print("Nilai r : ");
        r = in.nextInt();

        vol(r);



    }

    private static void vol(int r){
        double volume = 4 * Math.PI * Math.pow(r,3)/3;
        System.out.print("Hasil = " + volume);
    }
}
