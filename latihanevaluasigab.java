import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
      Scanner isc = new Scanner (System.in);
      
      /*
      String nama = isc.nextLine();
      System.out.printf("%nNama saya: %s",nama);
      int umur=isc.nextInt();
      umur++;
      System.out.printf("%numur saya(tahun depan): %d",umur);
     
      String gaji= "2000000";
      int gaji2= Integer.parseInt(gaji);
      System.out.printf("%ngaji pokok saya: %d",gaji2);
      
       final double bonus1 = 5.0/100.0, bonus2=10.0/100.0;
       
      gaji2+= gaji2*bonus2;
      System.out.printf("%nGaji kotor saya: %d", gaji2);
      gaji2-=gaji2*bonus1;
      System.out.printf("%nGaji bersih saya: %d", gaji2);
      gaji2*=20.0/100;
      System.out.printf("%ntabungan saya perbulan: %d", gaji2);
      gaji2*=12;
      System.out.printf("%nTotal tabungan saya setahun kedepan: %d", gaji2);
      */
      
      char nomor= isc.next().charAt(0);
      if (nomor=='1'){
        System.out.println("pilihan : persegi");
        int sisi = 5;
        int hasil=sisi*sisi;
        System.out.printf("%nluas persegi: %d", hasil);
        boolean gg = hasil%2==0;
        System.out.println("\nApahkah genap: "+gg);
        
      } else if(nomor=='2'){
         System.out.println("pilihan : persegi panjang");
        int panjang = 7, lebar= 5;
        panjang*=lebar;
        System.out.printf("%nluas persegi panjang: %d", panjang);
        boolean gg = panjang%2==0;
        System.out.println("\nApahkah genap: "+gg);
        
       
      }else if(nomor=='3'){
        System.out.println("pilihan : lingkaran");
        double phi = 3.14;
        int jari= 5;
        phi*=jari*jari;
        System.out.printf("%nluas lingkaran desimal: %.2f", phi);
        int asli= (int)phi;
        System.out.printf("%nluas lingkaran bulat: %d", asli);
        boolean gg = phi%2==0;
        System.out.println("\nApahkah genap: "+gg);
        
      }else{
        System.out.println("\t\nPESAN ERROR");
      }
       
  }
}
