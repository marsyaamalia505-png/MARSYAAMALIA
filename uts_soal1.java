import java.util.Scanner;

public class  day12{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     String nama = isc.nextLine();
     double modalama= isc.nextDouble();
     int lamainvestasi= isc.nextInt();
     double keuntungan = modalama *3/100;
     double modalbaru= modalama;
     double tamp= 0;
     
     for (int i = 1;i<=lamainvestasi;i++ ){
       modalbaru+=keuntungan;
       
       System.out.printf("%nhari ke- %d : Saldo= Rp%.2f",i,modalbaru);
       //tamp+=modalbaru;
      
     } 
      System.out.printf("%nModal awal : %.2f%n",modalama);
      System.out.printf("%nsaldo akhir: %.2f%n",modalbaru);
     System.out.printf("%ntotal keuntungan bersih: %.2f%n",(modalbaru-modalama));
     
      if(modalbaru>modalama*2){
         System.out.println("Invertasi sangat mengutungkan");
       }else if(modalbaru<modalama*2 && modalbaru>modalama*1.5 ){
         System.out.println("Investasi menguntungkan");
       }else{
         System.out.println("Kurang optimal");
       }
     
    }
}
