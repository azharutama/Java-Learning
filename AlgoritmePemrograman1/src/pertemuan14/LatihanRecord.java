package pertemuan14;

import java.util.Scanner;

public class LatihanRecord {
	/*
	 * record adalah struktur data yang akan memungkinkan program mengeola banyak nilai tetapi nilai tersebu
	 * saling mengikat 
	 * contohnya nrp akan terikat dengan satu nama mahasiswa saja, nilai ipk, semester dan lain lain
	 * 
	 * dimana dalam pembuatannya record dalam java megharuskan kita membuat kelas baru yang dituliskan method
	 * (tanpa public static void main)
	 * 
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		Buku book= new Buku ();
		
		book.inputNilai("Harry Potter ", "garafindo ", "jk rowling ", 240_000);
		System.out.println("Buku "+ book.getJudul()+ "memiliki harga " + book.getHarga());
		
		Buku buku2 = new Buku ();
		String judul,penulis, penerbit;
		int harga;
		
		System.out.println("judul buku : ");
		judul = sc.nextLine();
		
		System.out.println("penulis buku : ");
		penulis = sc.nextLine();
		
		System.out.println("penerbit buku : ");
		penerbit = sc.nextLine();
		
		System.out.println("Harga buku : ");
		harga = sc.nextInt();
		
		buku2.inputNilai(judul, penerbit, penulis, harga);
		System.out.println("judul buku : " + buku2.getJudul()+ "\n" 
		+ "penulis: " + buku2.getPenulis()+ "\n"
	    + "penerbit: " + buku2.getPenerbit()+ "\n" 
		+ "Harga : " + buku2.getHarga() );

	}
}
