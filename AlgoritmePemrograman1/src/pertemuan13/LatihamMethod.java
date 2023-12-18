package pertemuan13;

import java.util.Scanner;

public class LatihamMethod {
	/*
	 * method yang dikenal dengan prosedur atau fungsi adalah sebuah subprogram yang merupakan bagian dari program
	 * yang dituliskan didalam class, tetapi diluar main program
	 * 
	 * 
	 * secara format method memiliki penulisan yang mirip dengan main, yaitu :
	 * 
	 * public static [tipe data] [namaMethod] (parameter){
	 * isi method
	 * return value ;()
	 * }
	 * 
	 * tipe data ini yang akan membedakan yg mana prosedur yang mana function
	 * 
	 * dimana prosedur akan selalu mengguankan tipe data void yang berarti kosong sehingga tidak ada return value
	 * 
	 *
	 * 
	 * contoh prosedur tampil nama:
	 * 
	 * public static void main tampilNama(){
	 * System.out.println("nama anda")
	 * }
	 * 
	 * contoh soal
	 * bualah program yang akan menerima inputan keyboard untuk pengisian nama lalu munculkan naka tersebut dimana 
	 * program tersebut harus menggunakan prosedur
	 */
	
	//bisa disini
	
	
	public static void tampilNama() {
		Scanner sc=new Scanner (System.in);
		String nama;
		
		System.out.print("masukan nama anda: ");
		nama = sc.next();
		System.out.println("selamat datang " + nama);
	}
	public static void main(String[]args) {
		tampilNama();
		
	}
	
	//bisa disini 
}
