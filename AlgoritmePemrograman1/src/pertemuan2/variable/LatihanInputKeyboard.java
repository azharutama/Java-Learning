package pertemuan2.variable;

import java.util.Scanner;

public class LatihanInputKeyboard {
	public static void main(String [] args) {
     /*membuat program dengan scanner
      *scanner adalah fungsi untuk menerima inputan keyboard 
      *scanner pengguanaannya mengikuti tipe data variable penampung 	
      */
		
	Scanner sc = new Scanner (System.in);
	
	System.out.print("NRP :");
	String sNRP = sc.next();// next() untuk input data
	
	System.out.print("Nama :");
	String sNama = sc.next();
	
	System.out.print("IPK :");
	double dIPK= sc.nextDouble();
	
	System.out.print("Umur :");
	int iUmur= sc.nextInt();
	
	System.out.println( " nama saya " + sNama + " dengan nrp " + sNRP + " memiliki ipk " + dIPK); 
	
	}
}
