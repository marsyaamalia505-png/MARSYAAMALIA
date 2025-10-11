import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
    Scanner isc = new Scanner (System.in);
    System.out.println("LATIHAN MENGGABUNGKAN BEBERAPA OPERATOR");
    System.out.print("\nMasukkan nilai tugas: "+"\nMasukkan nilai Uts: "+"\nMasukkan nilai Uas: ");
    int tugas = isc.nextInt(), Uts = isc.nextInt(), Uas = isc.nextInt();
     
      int  hasil = (tugas*30/100)+(Uts*30/100)+(Uas*40/100);
      boolean predikat = hasil>=80 && hasil <=100;
      
      int ketentuan = Boolean.compare(predikat,false);
    
      
      
      
      System.out.println(ketentuan);
      ketentuan*=tugas;
      System.out.println(ketentuan);



  }
}
