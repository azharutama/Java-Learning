package pertemuan6;

import java.util.Scanner;

public class LatihanSwitchCase {
/* 
 * switch case adalah statement lain dari struktur kontrol percabangan dimana digunakan untuk pengkondisian yang terurut 
 * seperti menu
 * 
 * format :
 * switch (variable){
 * case a: //syarat a
 * 			break;
 * case b: //syarat b
 * 			break;
 * ....
 * case n: //syarat n
 * 			break;
 * default: // jika inputan tidak dikenali
 * 			break;
 * 
 * contoh:
 * buatlah program untuk menerima input layanan *123# dalam suatu oprator , dimana menunya adalah:
 * 1.paket internet 
 * 2. paket sosmed
 * 3. paket telp/sms
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int input;
		System.out.println("silahkan Pilih Menu:\n"
		+ " 1. paket internet\n"
		+ " 2. paket sosmed\n"
		+ "3. paket telp/sms");
		
		System.out.println("masukan menu yang anda pilih: ");
		input = sc.nextInt();
		
		switch (input) {
		case 1 :System.out.println("masukan paket internet"); break;
		case 2 :System.out.println("masukan paket sosmed "); break;
		case 3 :System.out.println("masukan paket telp/sms"); break;
		default :System.out.println("input tidak dikenali");break;
		}
		
		
	}
}
