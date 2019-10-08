
import java.util.Scanner;

public class tugas1 {
    
    public static void main(String[] args) {
       //[For]
       /*
       for(a=0; a<=5; a++){
           System.out.println("nilai dari a ke-"+a+" adalah"+a);
       }*/
       
       //[While]
       /*while(a<5){
           System.out.println("nilai dari a ke-"+a+" adalah"+a);
           a++;
       }*/
       //[DO While]
       /*do{
           System.out.println("nilai dari a ke-"+a+" adalah "+a);
           a++;
       }while(a<5);*/
//       int a = 0;
//       int b = 0;
//       boolean polaa,polab;
       Scanner masuk = new Scanner(System.in);
//       
//       System.out.print("Masukan angka A = ");
//       a = masuk.nextInt();
//       System.out.println("Angka A = " + a );
//       
//       System.out.print("Masukan angka B = ");
//       b = masuk.nextInt();
//       System.out.println("Angka B = " + b);
       
       /*if(a>b){
          System.out.println("Angka A lebih besar");
       }else if(a==b){
          System.out.println("Angka A dan B sama");
       }else{
            System.out.println("Angka ke dua lebih besar");
       }*/
       /*switch(a){
           case 1:
               System.out.println("A ini angka satu");
           break;
           case 2:
               System.out.println("A ini angka dua");
           break;
           case 3:
               System.out.println("A ini angka tiga");
           break;
           default:
              System.out.println("angka lebih dari tiga");
       }*/
//       if(a % 2 == 0){
//          polaa=true;
//       }else{
//          polaa=false; 
//       }
//       if(b % 2 == 0){
//           polab=true;
//       }else{
//           polab=false;
//       }
//       if(polaa == polab){
//           System.out.print("Papan catur hitam");
//       }else{
//           System.out.println("Papan catur putih");
//       }

        int a, b;
        
        System.out.print("Baris : ");
        a = masuk.nextInt();
        
        System.out.print("Kolom : ");
        b = masuk.nextInt();
        
        if ((a+b)%2 == 0){
            System.out.println("Hitam");
        }else{
            System.out.println("Putih");
        }

    }
}