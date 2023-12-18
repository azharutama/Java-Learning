package praUTS;

import java.util.Scanner;

public class LaptopAR {
 int N=1;
 laptop[] a= new laptop[N];
 
 
 void IsiArray() {
	 laptop x;
	 Scanner sc=new Scanner (System.in);
	 for(int i=0; i<N;i++) {
		 x = new laptop();
	 System.out.println("masukan value " +i+ ":");
	 x.BacaLaptop();
	 a[i]=x;
	 }
 }
 
 void TampilArray() {
	for(int i=0; i < N ;i++) {
	 System.out.println("data laptop " + ": " +a[i] . nama+" "  +a[i] . tipe +" " +a[i].harga +" " + a[i].stok  );
//	
	 
	 }
 }

 
 
public static void main(String[]args) {
	LaptopAR A=new LaptopAR();
	LaptopAR B=new LaptopAR();
    A.IsiArray();
    A.TampilArray();
    
   
}
}