import java.util.Scanner;

public class  day12{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
    int setoran = isc.nextInt();
    int hari = isc.nextInt();
    int setoranlebih= isc.nextInt();
  //int tamp=2000;
  
    for (int i= 1;i<=hari ;i++ ){
      
      
      if (i%4==0){
        setoran+=setoranlebih;
         System.out.println("hari ke-"+i+" tabungan anda: "+setoran);
      } else{
        System.out.println("hari ke-"+i+" tabungan anda: "+setoran);
      }
      
        setoran+= 2000;
    } 

  }
}
