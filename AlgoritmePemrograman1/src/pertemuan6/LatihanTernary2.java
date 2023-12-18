package pertemuan6;

import java.util.Scanner;

public class LatihanTernary2 {
	/*buatlah progtram dengan ternary if yang akan menerima input IPK, dimana program ini unruk seleksi beasiswa dengan syarat :
	 * 1. jika ipk >= 3,25 maka akan muncul "syarat terpenuhi"
	 * 2. jika ipk >= 2.75maka akan muncul "masuk seleksi"
	 * 3. jika ipk <2,77 maka akan muncul "tidak diterima"
	 * 
	 * 
	 * format
	 * [tipe data] variable = (syarat 1)? "true" : "true" : "false";
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double ipk;
		System.out.println("masukan IPK: ");
		ipk = sc.nextDouble();
		
		String hasil = (ipk >= 3.25)? "syarat terpenuhi " : (ipk >= 2.75)? "masuk seleksi" : "tidak diterima";
		System.out.println(hasil);
	}

}
