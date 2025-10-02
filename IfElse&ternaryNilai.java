import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
      Scanner isc = new Scanner (System.in);
      
      double tugas = isc.nextDouble();
      double uts = isc.nextDouble();
      double uas = isc.nextDouble();
      
      tugas*=30.0/100;
      uts*=30.0/100;
      uas*=40.0/100;
      double nilai = tugas +uts+uas;
      System.out.println("nilai akhir: "+nilai);
      
      if (nilai>=90){
        System.out.print("\npredikat A "+nilai);
      } else if( nilai <90 && nilai >=80 ){
         System.out.print("\npredikat B "+nilai);
      }else if(nilai <80 && nilai>=70 ){
         System.out.print("\npredikat C "+nilai);
      }else { 
         System.out.print("\npredikat D "+nilai);
      }
      
      String hasil = (nilai>=70)? "\nLulus":"\ntidak lulus";
      System.out.print(hasil);
