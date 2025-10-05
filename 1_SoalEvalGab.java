import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
  Scanner isc = new Scanner (System.in);
  
  //soal 1
  int apa= isc.nextInt(), opo= isc.nextInt();
  apa*=opo;
  System.out.println(apa/2);
  
  //soal no 2
  int a = isc.nextInt();
  int hasil2= a*50/100, hasil3= a/3;
  a-=hasil2;
  System.out.print(a+" ");
  a-=hasil3;
  System.out.print(a+" ");
  a-=hasil3-hasil2;
  System.out.println(a);
  
  
  
  //Soal nomor 3
  int c = isc.nextInt(), d= isc.nextInt();
  System.out.println(c/d);
  System.out.println(c%d);
  
  //soal no 4
 int e = isc.nextInt(), f= isc.nextInt(), g=isc.nextInt(), h=isc.nextInt();
 e*=f;
 g*=h;
 int hasil= Math.abs(g-e);
 System.out.println(hasil);
 
 
 //soal no 5
int u = isc.nextInt(), m= isc.nextInt(), y=isc.nextInt();
u+=u*20.0/100;
m+=m*15.0/100;
System.out.println(u+m+y);




    }
}
