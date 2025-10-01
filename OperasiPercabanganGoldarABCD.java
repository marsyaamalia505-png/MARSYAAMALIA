import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner isc= new Scanner (System.in);
      String apa = isc.nextLine();
      System.out.println("Nama karyawan: "+apa);
      char goldar = isc.next().charAt(0);
      System.out.println("Goldar anda (A,B,C,D): "+goldar);
      int jam = isc.nextInt();
      System.out.println("jam kerja anda dalam seminggu: "+jam);
      
      if (goldar=='A'){
        int pokok= 50000;
        System.out.println("gaji pokok anda: "+pokok);
        if(jam>40){
        jam*=20000;
        System.out.println("lembur anda sebesar: "+jam);
        }else{
          System.out.println("gaji akhir anda: "+pokok);
        }
        if(pokok+jam>=2000000){
          int hasil = pokok+jam*10/100;
          System.out.println("bonus: "+hasil);
          int gaji = pokok+jam+hasil;
          System.out.println("total gaji anda dengan bonus: "+ gaji);
        }else{
        System.out.println("total gaji anda: "+(pokok+jam));
      } 
      
      }else if(goldar=='B'){
        int pokok= 40000;
        System.out.println("gaji pokok anda: "+pokok);
        if(jam>40){
        jam*=15000;
        System.out.println("lembur anda sebesar: "+jam);
        }else{
          System.out.println("gaji akhir anda: "+pokok);
        }
        if(pokok+jam>=2000000){
          int hasil = pokok+jam*10/100;
          System.out.println("bonus: "+hasil);
          int gaji = pokok+jam+hasil;
          System.out.println("total gaji anda dengan bonus: "+ gaji);
        }else{
        System.out.println("total gaji anda: "+(pokok+jam));
      } 
      
      
      }else if(goldar=='C'){
        int pokok= 30000;
        System.out.println("gaji pokok anda: "+pokok);
        if(jam>40){
        jam*=10000;
        System.out.println("lembur anda sebesar: "+jam);
        }else{
          System.out.println("gaji akhir anda: "+pokok);
        }
        if(pokok+jam>=200000){
          int hasil = pokok+jam*10/100;
          System.out.println("bonus: "+hasil);
          int gaji = pokok+jam+hasil;
          System.out.println("total gaji anda dengan bonus: "+ gaji);
        }else{
        System.out.println("total gaji anda: "+(pokok+jam));
      } 
      
      
      }else if(goldar=='D'){
        int pokok= 25000;
        System.out.println("gaji pokok anda: "+pokok);
        if(jam>40){
        jam*=5000;
        System.out.println("lembur anda sebesar: "+jam);
        }else{
          System.out.println("gaji akhir anda: "+pokok);
        }
        if(pokok+jam>=2000000){
          int hasil = pokok+jam*10/100;
           System.out.println("bonus: "+hasil);
          int gaji = pokok+jam+hasil;
         
          System.out.println("total gaji anda dengan bonus: "+ gaji);
        }else{
        System.out.println("total gaji anda : "+(pokok+jam));
      }
      
      
      
      }else{
        System.out.println("goldar anda tidak terbaca");
      }  
           
  }
}
