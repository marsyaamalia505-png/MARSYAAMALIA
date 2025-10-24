import java.util.Scanner;

public class  Day47{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     
      System.out.println("Masukkan jadwal anda: ");
      System.out.println("senin");
      String a= isc.nextLine();
       System.out.println("selasa");
      String b= isc.nextLine();
       System.out.println("rabu");
      String c= isc.nextLine();
       System.out.println("kamis");
      String d= isc.nextLine();
       System.out.println("jumat");
      String e= isc.nextLine();
       System.out.println("sabtu");
      String f= isc.nextLine();
       System.out.println("minggu");
      String g= isc.nextLine();
      
      
      System.out.println("Masukkan hari sekarang apa? ");
      //isc.nextLine();
     
      String jadwal= isc.nextLine();
     
      switch (jadwal){
        case "senin":
          System.out.print("Jadwal anda adalah "+a);
          break;
        case "selasa":
         System.out.print("Jadwal anda adalah "+b);
          break;
        case "rabu":
         System.out.print("Jadwal anda adalah "+c);
         break;
        case "sabtu":
          System.out.print("Jadwal anda adalah "+f);
          break;
          
          default:
          if (jadwal.equalsIgnoreCase("jumat")||jadwal.equalsIgnoreCase("minggu")){
            System.out.println("jadwal anda adalah "+e);
            
          } else if (jadwal.equalsIgnoreCase("kamis")){
            System.out.println("jadwal anda adalah "+d); 
            
          }else {
            System.out.println("tolong masukkan hari senin hingga minggu saja");
          }
          
          
  
          
      }
   
      
    }
}
