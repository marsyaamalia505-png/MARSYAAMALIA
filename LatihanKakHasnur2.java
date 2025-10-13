import java.util.Scanner;

public class  day12{
   public static void main(String[] args) {
     Scanner isc = new Scanner (System.in);
    int jarak= isc.nextInt();
    int waktu= 1;
    int tamp= 0;
   
    for (int i=1 ;i<=jarak ;i++ ){
       
      if (i==8){
        System.out.println("langkah ke-"+i+" sandalnya putus");
        waktu+=1;
        continue;        
      }
            
      if(i==17){
        System.out.println("langkah ke-"+i+" dia melewati rumah budi");
        System.out.println("APAKAH DIA AKAN SINGGAH?");
         boolean jawaban = isc.nextBoolean();
        
        if(jawaban==true){
           System.out.println("masuk dan minum kopi");
           System.out.println("singgah");
           waktu+=60*5;
           System.out.println("total langkah: "+ i);
           break;
          }else{
            System.out.println("tidak");
            waktu+=1;
            continue;  
        }  
       }
      if(i==28){
           System.out.println("langkah ke-"+i+" dia melewati rumah mail");
           
            System.out.println("APAKAH DIA AKAN SINGGAH?");
            boolean jawaban2= isc.nextBoolean();
            if(jawaban2== true){
               System.out.println("masuk dan main ps");
               System.out.println("singgah");
               waktu+=60*15;
               System.out.println("total langkah: "+ i);
               break;
            }else{
              System.out.println("tidak");
               waktu+=1;
           continue; 
            }
          
       }
            if (i==47){
               System.out.println("langkah ke-"+i+" dia singgah ke toko beli sandal baru");
             waktu+=1;
            continue;
          
            } 
            
      if(i==123){
              System.out.println("langkah ke-"+i+" dia melewati lapangan sepak bola");
             
              System.out.println("APAKAH DIA AKAN SINGGAH?");
              boolean jawaban3= isc.nextBoolean();
              if(jawaban3== true){
                System.out.println("berhenti dan main bola");
                System.out.println("singgah");
                  waktu+=60*30;
               System.out.println("total langkah: "+ i);
                break;
                
              }else{
                System.out.println("tidak ");
               waktu+=1;
                continue;
              }             
      }
            if(i==270){
              waktu+=1;
            }else{
              waktu+=1;
            }
            
            System.out.println("langkah ke-"+i);
    } 
            if(jarak==270){
              System.out.println("Bagas sampai disekolah");
            }else{
              System.out.println("bagas tidak sampai sekolah");
            }
              
               int menit = waktu/60, detik = waktu%60;
              System.out.println(menit+" menit "+detik+" detik");

        }
        
  }
     
