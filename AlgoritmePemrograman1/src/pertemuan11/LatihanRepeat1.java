package pertemuan11;

import java.util.Scanner;

public class LatihanRepeat1 {
	
	public static void main(String[]args) {
		
		/*
		 * 
		 * repeat dikenal dengan istilah do while di java, nilainya tidak terprediksi
		 * tapi berbeda dengan while di proses pengecekan syarat 
	format
		
		do {
			statement berulang 
		} while(syarat);
		
		
		contoh kasus
		
		buatlah pengulangn selama menerima inputan "selesai"
		 */
		
		Scanner sc =new Scanner (System.in);
		String input;
		
		System.out.println("masukan kata yang diinginkan : ");
		input=sc.next();
		
	
		
		do {
			System.out.println("masukan kata yang diinginkan : ");
			input= sc.next();
		}while (!input.equalsIgnoreCase("selesai"));
	}

}
