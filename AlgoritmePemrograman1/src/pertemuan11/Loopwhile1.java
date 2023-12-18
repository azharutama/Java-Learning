package pertemuan11;

import java.util.Scanner;

public class Loopwhile1 {
		public static void main(String[]args) {
			 /*
			  * loop whhile adalah pengulangan yang tidak terpreiksi jumlah pengulanganya .
			  * karena disebabkan oleh csts pengulangannya
			  * 
			  * 
			  * formatnya
			  * 
			  * while (condition) {
				  // code block to be executed
				}
				
				buatlah pengulangan yang terjadi selama menerima inputan bukan " selesai".
				
				kata kunci "selama".
			  */
			
			
		Scanner sc=new Scanner (System.in);
		String input;
		
		System.out.println("masukan kata yang diinginkan : ");
		input=sc.next();
		
		while (!input.equalsIgnoreCase("selesai")) {
			
			System.out.println("masukan kata yang diinginkan : ");
			input= sc.next();
		}
				
		}
}
