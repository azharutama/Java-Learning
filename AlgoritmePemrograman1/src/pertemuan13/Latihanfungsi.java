package pertemuan13;

import java.util.Scanner;

public class Latihanfungsi {
	/*
	 * 
	 * fungsi adlah tipe method yang  memiliki return value (mengeluarkan nilai)
	 * karena memiliki tipe data.
	 * 
	 * tipe data yang dikeluarkan fungsi disesuaikan dengan nilai yang dikelarkan fungsi
	 * 
	 * buatlah body massindex
	 * 
	 * 1. fungsi input nama
	 * 2. fungsi hitung BMI dengan input berat dan tinggi ruumus BMI= berat (kg)/tinggi(meter)
	 * 3. tampilkan hasil di main
	 * 
	 */
	
	
	static Scanner sc = new Scanner (System.in);
	public static String inputNama () {
		//string karena inputan tipe string
		String nama;
		System.out.print("masuka nama anda: ");
		nama = sc.nextLine();
		return nama;
		
		
	}
	public static double hitungBMI() {
		//double karena hasilnya inputan tipe desimal
		double tinggi,berat,bmi;
		System.out.print("masukan berat(kg): ");
		berat = sc.nextDouble();
		System.out.print("masukan tinggi(m): ");
		tinggi = sc.nextDouble();
		
		bmi = berat/(tinggi*tinggi);
		return bmi;
	}
	
	public static void main(String[]args) {
		String outputNama=inputNama();
		double hasilBMI=hitungBMI();
		System.out.println(outputNama + " memiliki bmi "+ hasilBMI);
				
			
	}

}
