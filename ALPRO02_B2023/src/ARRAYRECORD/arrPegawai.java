package ARRAYRECORD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import File.Pegawai;

public class arrPegawai{
 int N=2;
 Pegawai[] a= new Pegawai[N];
 
 
 void IsiArray() {
	 Pegawai x;
	 Scanner sc=new Scanner (System.in);
	 for(int i=0; i<N;i++) {
		 x = new Pegawai();
	 System.out.println("masukan value " +i+ ":");
	 x.BacaNilai();
	 a[i]=x;
	 }
 }
 
 

	 void TampilArray() {
			for(int i=0; i < N ;i++) {
			 System.out.println("el array ke " +i+ ":" +a[i]);
			 a[i].TulisNilai();
			 }
		 }
	 
	 void arsipPegawai() {
		 Pegawai Pegawai=new Pegawai(N, null, N, N, N);
		  int Nip;   
		  String Nama; 
		  int jim;
		  int jit;
		  double gaji;
		 
	 	 	 
	 	 	System.out.print("test 1: "); 
	 	 	ObjectOutputStream out = null;  	
	 	 	System.out.print("test 2: ");  	 try {   
	 	 	 // 1. buka file untuk ditulis  	 	 System.out.print("test 3: "); 
	          out=new ObjectOutputStream(new FileOutputStream("C:\\DataAlpro\\Nasabah.dat"+ ""));// Nama direktori+file 
	          System.out.print("test 4: ");  	          for (int i=1;i<=3;i++) { 	         	   
	      			Scanner sc=new Scanner (System.in);
	      			System.out.println("NIP :");
	      			 Nip =sc.nextInt();
	      			 System.out.println("Nama :");
	      			 Nama =sc.next();
	      			 System.out.println("jim:");
	      			 jim =sc.nextInt();
	      			 System.out.println("jit :");
	      			 jit =sc.nextInt();
	      			 gaji= 10000*jim-10000*jit;
	           Pegawai=new Pegawai(Nip,Nama,jim , jit,gaji);          System.out.print("test 5: "); 
	 	              out.writeObject(Pegawai);// tulis record ke file     
	 	          }    
	 	          System.out.print("test 6: ");  	          out.close(); 
	 	          } catch (IOException e) { 
	 	         	   
	 	                e.printStackTrace(); 
	 	        } 
		 
	 }
	 
	 void tampilArsipPegawai() {
		 
	 }




public static void main(String[]args) {
	arrPegawai A=new arrPegawai();
	A.IsiArray();
	A.TampilArray();  
	A.arsipPegawai() ;
	A.tampilArsipPegawai();

}
}
