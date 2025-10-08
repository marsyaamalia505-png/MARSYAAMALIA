import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner isc = new Scanner (System.in);

  byte angka= isc.nextByte();
  byte angka2= isc.nextByte();
  
  // operator OR (||) digunakan untuk memberikan opsi kondisi apabila kondisi pertama tidak terpenuhi
  boolean bandingkan= angka < angka2 || angka2==10;
  boolean bandingkan2= angka2%2==1;
  boolean bandingkan3= angka%2==0;
  
  
  System.out.println("hasil 1 "+ bandingkan+"\nhasil 2 "+bandingkan2+"\nhasil 3 "+bandingkan3);
   
   
      
    }
}
