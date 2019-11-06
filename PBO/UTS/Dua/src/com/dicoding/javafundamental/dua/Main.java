package com.dicoding.javafundamental.dua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        double volume;
//        int r;
//
        Scanner in = new Scanner(System.in);
//        System.out.print("Nilai r : ");
//        r = in.nextInt();
//
//        vol(r);

        int x, y;
        System.out.print("Niali x : ");
        x = in.nextInt();
        System.out.print("Nilai y : ");
        y = in.nextInt();

        akar(x,y);



    }

    private static void vol(int r){
        double volume = 4 * Math.PI * Math.pow(r,3)/3;
        System.out.print("Hasil = " + volume);
    }

    private static void akar(int x, int y){
        int z = (int) Math.sqrt(x*x + y*y);
        System.out.print("Hasil akar : " + z);
    }
}
