package pertemuan12;

import java.util.Scanner;

public class nestedloop2 {
	public static void main(String[] args) {

		/*
		 * 
		 * buatlah program yang menghasilkan output :
		 * 
		 *
		 */
		Scanner input=new Scanner (System.in);
		System.out.println("masukan jumlah baris: ");
		int number= input.nextInt();
		
		
		
		for (int z = 1; z <= number; z++) {
			//loop semua baris
			for (int a = 1; a <=number; a++) {
				//loop tiap baris
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
	