import java.util.Scanner;

public class  day12{
    public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
     String nama = isc.nextLine();
     double modalama= isc.nextDouble();
     int lamainvestasi= isc.nextInt();
     double keuntungan = modalama *3/100;
     int modalbaru= (int)modalama;
     int tamp= 0;
     
     for (int i = 1;i<=lamainvestasi;i++ ){
       modalbaru+=keuntungan;
       
       System.out.println("Saldo hari ke-"+i+": "+modalbaru);
       tamp+=modalbaru;
      
     }  System.out.println("total keuntungan bersih: "+tamp);
     
      if(modalbaru>modalama){
         System.out.println("Invertasi sangat mengutungkan");
       }else if(modalbaru>modalama*1.5 && modalbaru<modalama*2 ){
         System.out.println("Investasi menguntungkan");
       }else{
         System.out.println("Kurang optimal");
       }
     
     
