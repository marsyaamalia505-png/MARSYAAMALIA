import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner isc  = new Scanner (System.in);
     
    
      int awal =0, akhir = 100;
      int angkabom= 60;
    
   
      for (;;) {
        
        System.out.println("Masukkan "+awal+"-"+akhir+":");
        int angkarange2= isc.nextInt();
        
        
        
         if (angkarange2 == angkabom ) {
            System.out.println("BOM");
      break;
      
         }else if(angkarange2<angkabom){
           awal = angkarange2;
           
         }else if(angkarange2>angkabom){
           akhir= angkarange2;
          
           
         }
     
    }
     
