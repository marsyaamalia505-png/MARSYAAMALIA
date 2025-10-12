import java.util.Scanner;

public class Day35{
    public static void main(String[] args) {
   Scanner isc = new Scanner (System.in);
   
   for (int i = 1;i<=7 ;i++ ){
     System.out.println("Masukkan jam belajar hari ke-"+i+" :");
      int jambelajar= isc.nextInt();
     if (jambelajar>=3){
       System.out.println("Hebat, kamu belajar tekun hari ke-"+i);
     } else{
       System.out.println("Kamu harus lebih rajin di hari ke-"+i);
     }
   } 
   
 
     
  }
}


  }
}
