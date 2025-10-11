import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
    Scanner isc = new Scanner (System.in);
   String username= isc.nextLine();
   short pin = isc.nextShort();
   
   if (pin==1234){
     System.out.println("Selamat datang, "+username);
   } else{
     for (int i = 1;i <=3;i++){
       
       System.out.println("Masukkan pin: ");
       short pinupdate= isc.nextShort();
       boolean hasil = pinupdate == 1234;
       
       if(hasil==true){
         System.out.println("Selamat datang, "+ username);
         break;
       }else if(i==3){
         System.out.println("Akun diblokir");
        
       }
         
       }
       
     } 
     
 
     
   }
      

  }
     
