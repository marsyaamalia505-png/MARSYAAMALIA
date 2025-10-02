import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner isc = new Scanner (System.in);
      String nama = isc.nextLine();
      System.out.println("Nama saya: "+nama);
      double ipk= isc.nextDouble();
      System.out.println("IPK saya: "+ipk);
      int penghasilan= isc.nextInt();
      System.out.println("Penghasilan orang tua: "+penghasilan);
      int tanggungan = isc.nextInt();
      System.out.println("jumlah tanggunagan ortu: "+tanggungan);
      
      if (ipk >=3.5 && penghasilan<3000000 && tanggungan >=3){
        String status = "layak";
        System.out.println(status+ "\nSelamat!, anda mendapatkan beasiswa");
      } else{
        String status2= "Tidak layak";
        
        if(ipk <=3.5 && penghasilan >3000000 && tanggungan <3){
          System.out.println(status2+"\nAlasan anda tidak lolos karena ipk, tanggungan, dan penghasilan tidak memenuhi");
        
        }else if (ipk <=3.5 || penghasilan >3000000 &&tanggungan <3){
          System.out.println(status2+"\nAlasan anda tidak lolos karena penghasilan dan tanggungan tidak memenuhi");
      
        }else if (tanggungan <3 || penghasilan >3000000 && ipk <=3.5 ){
          System.out.println(status2+"\nAlasan anda tidak lolos karena ip k dan penghasilan tidak memenuhi");
        
          
        }else if (penghasilan >3000000 || tanggungan <3 && ipk >=3.5 ){
          System.out.println(status2+"\nAlasan anda tidak lolos karena ipk dan tanggungan tidak memenuhi");
        
          
        }else{
      
        if(ipk <=3.5 ){
          System.out.println(status2+ "\nAlasan anda tidak lolos karna "+ipk);
        }else if(penghasilan>3000000){
          System.out.println(status2+ "\nAlasan anda tidak lolos karna "+penghasilan);
}else if(tanggungan <3){
          System.out.println(status2+ "\nAlasan anda tidak lolos karna "+tanggungan);
        }else{
          System.out.println(" ");
        }
       
        }
        
        
      
      }
      
  }
