package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFmultisyarat {
	public static void main(String[] args) {
		
		/*
		 * statement if adalah statement percsmbangan dengan satu kemungkinan yang akan muncul 
		 * format: 
		 * if (boolean_expression){
		 * statement
		 * }
		 * 
		 * 
		 * buat lah program yang menerima inputan keybiard dengan nilai bilangn bulat ,lalu program akan mengecek  apakah nilai 
		 * tersebut apakah termasuk diantara niali 60 smapai 100, jika iya maka akan muncul statement "anda memenuhi syarat"
		 * 
		 * pengkondisian memungknkan mengguanakan syarat >1 dimana ada dua statement multi syarat:
		 * AND, berarti semua konndisi harus terpenuhi. &&
		 * OR, berarti cukup salah satu terpenuhi. ||
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int nilai;
		System.out.print("masukan nilai : ");
		nilai= sc.nextInt();
		
		if((nilai >= 60) && (nilai <=100)) {
			System.out.println("anda memenuhi syarat");
		}

	}
}
