package pertemuan6;

import java.util.Scanner;

public class LatihanTernaryIF {
	
	/*ternary if adalah bentuk lain dari statement if , dimana  merupakan bentuk sigkatb dari ig 
	 * 
	 * format :
	 * [tipe data] variable_penampung = (nilai>=50)? "output TRUE" : "output False"
	 * 
	 * contoh soal :
	 * buatlah program dengan ternary if, dimana program akan menerima input nilai IPK, lalu prpgram akan melakukan pengecekan
	 * apakah IPK >=2,75? jika iya akan muncul "memenuhi syarat" jika tidak "maka akan muncul " mohon maaf"
	 * 
	 * 
	 */
public static void main(String[] args) {
	Scanner sInput = new Scanner (System.in);
	double dIPK;
	
	System.out.println(" masukan IPK anda : ");
	dIPK = sInput.nextDouble();
	
	String hasil= (dIPK>= 2.75)? "Memenuhi syarat": "mohon maaf";
	System.out.println(hasil);
}
}
