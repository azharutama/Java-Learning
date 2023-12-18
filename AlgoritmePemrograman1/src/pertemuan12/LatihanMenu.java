package pertemuan12;

import java.util.Scanner;

public class LatihanMenu {
	public static void main(String[]args) {
		/*
		 * 
		 * buatlah program yang akan selalu menamnpilkan menu berikut
		 * 1 internet
		 * 2 sosmed
		 * 3 sms telp
		 * 4 info
		 * 99 keluar
		 * 
		 * jika menekan 99 maka akan berhenti
		 * 
		 */
		
		Scanner sc = new Scanner (System.in);
		int menu = 0;
		
		while(menu!=99) {
			System.out.println("silahkan pilih menu berikut: \n"
			+"1.internet\n"
			+"2.sosmed\n"
			+"3.sms/telpon \n"
			+"4.info\n"
			+"99. keluar\n");
			System.out.print("menu yang anda pilih: ");
			menu= sc.nextInt();
			
			switch(menu){
				
				case 1 : System.out.println("menu internet");break;
				case 2 : System.out.println("menu sosmed");break;
				case 3 : System.out.println("menu sms/telp");break;
				case 4 : System.out.println("menu info");break;
				case 99 : System.out.println("selamat tinggal");break;
				default : System.out.println("menu tidak tersedia");break;
			}
		
			
		
		}
	}

}
