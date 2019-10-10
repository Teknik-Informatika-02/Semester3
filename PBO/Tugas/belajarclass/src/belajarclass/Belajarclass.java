package belajarclass;

public class Belajarclass {
    
    public static void main(String[] args) {
        
        mobil kendaraan = new mobil();
        mobil asik = new mobil();
        
        kendaraan.nama = "Minibus";
        kendaraan.jenis = "Avanza";
        kendaraan.merk = "Toyota";
        kendaraan.CC = 1300;
        
        asik.nama = "Sedan";
        asik.jenis = "City";
        asik.merk = "Honda";
        asik.CC = 1600;
        
        
        System.out.println(""+kendaraan.nama);
        System.out.println("Jenis : " +kendaraan.jenis);
        System.out.println("Merk : " +kendaraan.merk);
        System.out.println("CC : " +kendaraan.CC);
        
        kendaraan.pintu("Stakkkkkkk");
        System.out.println("");
        
        
        System.out.println(""+asik.nama);
        System.out.println("Jenis : " +asik.jenis);
        System.out.println("Merk : " +asik.merk);
        System.out.println("CC : " +asik.CC);
        
        
        
        
//      
//        mobil avanza = new mobil();
//        
//        suzuki.kecepatan = 100;
//        suzuki.berat = 200;
//        suzuki.merk = "Suzkui";
//        suzuki.tipe = "A";
//        
//        System.out.println("Kecepatan : " +suzuki.kecepatan);
//        System.out.println("Berat : " +suzuki.berat);
//        System.out.println("Merek : " +suzuki.merk);
//        System.out.println("Tipe : " +suzuki.tipe);
//        
//        Motor.shock ("DUAARRRR");
        
//        hewan kucing = new hewan();
//        
//        kucing.jenis = "Anggora";
//        kucing.kaki = 4;
//        kucing.warna = "Oren";
//        
//        System.out.println("jenis kucing : " +kucing.jenis);
//        System.out.println("kaki kucing : " +kucing.kaki);
//        System.out.println("warna kucing : " +kucing.warna);
//        
//        kucing.suara("Meoooooonngggg \n");
//        
//        String makanankucing = kucing.makanan("Ikan,Sayur,Nasi \n");
//        
//        System.out.print("Makanan Kucing : " +makanankucing);
//        

    }
    
}
