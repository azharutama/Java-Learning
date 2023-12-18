package praUTS;
import java.util.Scanner;

public class laptop {
	

	
		
	String nama;
	String tipe;
	int harga;
	int stok;

	void BacaLaptop() {
		Scanner sc=new Scanner (System.in);
		System.out.println("nama :");
		 nama =sc.next();
		 System.out.println("tipe :");
		 tipe =sc.next();
		 System.out.println("harga :");
		 harga =sc.nextInt();
		 System.out.println("stok :");
		 stok =sc.nextInt();
		}

	//void TulisMhs() {
//		Scanner sc=new Scanner (System.in);
//		System.out.println("NIM :");
//		 Nim =sc.nextInt();
//		 System.out.println("Nama :");
//		 Nama =sc.next();
//		 System.out.println("IPK :");
//		 Ipk =sc.nextDouble();
//		}
	}


