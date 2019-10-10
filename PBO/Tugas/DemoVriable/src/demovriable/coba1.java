package coba1.java;

import java.util.Scanner;

public class coba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int baris;
        int kolom;
        
        Scanner masuk = new Scanner (System.in);
        
        System.out.print ("Masukan Baris : ");
        baris = masuk.nextInt ();
        System.out.print ("Masukan Kolom : ");
        kolom = masuk.nextInt ();
        
        
        if ((baris+kolom) % 2 ==0){
                System.out.println("Hitam");
        }
               else {
                  System.out.println("Putih");     
               }
           }
        } 
