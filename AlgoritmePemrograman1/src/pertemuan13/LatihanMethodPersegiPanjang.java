package pertemuan13;

import java.util.Scanner;

public class LatihanMethodPersegiPanjang {
	
	/*
	 * 
	 * buatlah program hitung luas persegi panjang menggunakan method
	 * 
	 *1.terdapat prosedur input panjang dan lebar
	 *2.terdapat prosedur hoitung luas dan panjang
	 * 
	 */
	
	static int panjang, lebar;
	//variable global
	public static void main(String[]args){
		inputNilai();
		hitungLuas();

   }
	
	public static void inputNilai() {
		/*
		 * jika kita deklarasi variable didalam method, maka variable tersebut disebut variable 
		 * lokal atau tidak dikenali method lain
		 */
			Scanner sc= new Scanner (System.in);
			//int panjang, lebar;(variable lokal)
			System.out.print("panjang : ");
			panjang =sc.nextInt();
			System.out.print("lebar : ");
			lebar =sc.nextInt();
			
	}
	public static void hitungLuas() {
		int luas;
		luas= panjang * lebar;
		System.out.println("Luas= " + luas);
	}
}
