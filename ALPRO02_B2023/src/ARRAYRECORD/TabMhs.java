package ARRAYRECORD;

import java.util.Scanner;

public class TabMhs {
 int N=1;
 arrMhs[] a= new arrMhs[N];
 
 
 void IsiArray() {
	 arrMhs x;
	 Scanner sc=new Scanner (System.in);
	 for(int i=0; i<N;i++) {
		 x = new arrMhs();
	 System.out.println("masukan value " +i+ ":");
	 x.BacaMhs();
	 a[i]=x;
	 }
 }
 
 void TampilArray() {
	for(int i=0; i < N ;i++) {
	 System.out.println("data mahasiswa " +i+ ": " +a[i] . Nim +" "  +a[i] . Nama+" " +a[i].Ipk );
//	 System.out.println("el array ke " +i+ ": " +a[i] . Nim +a[i] . Nama+a[i].Ipk );
	 
	 }
 }

 
 
public static void main(String[]args) {
	TabMhs A=new TabMhs();
	TabMhs B=new TabMhs();
    A.IsiArray();
    A.TampilArray();
    
   
}
}