package pertemuan9;

import java.util.Scanner;

public class PengulanganDinamis {
	public static void main(String[]args) {
		/*
		 * buat pengulangan terukur positif nilai awal 1 dan nilai akhir bergantung user
		 */
		Scanner sc = new Scanner (System.in);
		int akhir;
		System.out.println("masukan nilai akhir pengulangan: ");
		akhir = sc.nextInt();
		
		for (int i = 1; i <= akhir ; i++) {
			System.out.println(i);
		}
	}
}
