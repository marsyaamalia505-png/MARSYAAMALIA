import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner isc = new Scanner (System.in);
      
      int angka = isc.nextInt();
      int jumlah = 1;
      
      for (int i=1;i<=angka ;i++ ){
        jumlah*=i;
        System.out.print("x"+i);
      } System.out.print("="+jumlah);
      
      
  }
}
