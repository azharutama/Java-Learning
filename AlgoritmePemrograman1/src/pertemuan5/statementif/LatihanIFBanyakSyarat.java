package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFBanyakSyarat {
	public static void main(String[] args) {
		/*
		 * statement if adalah statement percambangan dengan dua kemungkinan yang akan muncul 
		 * format: 
		 * if (boolean_expression){
		 *syarat 1 yang dieksekusi jika terpenuhi  
		 * }
		 * else if{
		 * syarat 2 yang dieksekusi jika terpenuhi  
		 * }
		 * else if{
		 * syarat 3 yang  dieksekusi jika terpenuhi  
		 * }
		 * else if {
		 * syarat n yang dieksekusi jika terpenuhi  
		 * }
		 * 
		 * 
		 * buat lah program yang menerima inputan keybiard dengan nilai bilangn bulat ,lalu program akan mengecek  dengan kondisi:
		 * 
		 * pengkondisian memungknkan mengguanakan syarat >1 dimana ada dua statement multi syarat:
		 * 1. jika nilai >=60 dan <=100 , maka dituliskan "anda lulus"
		 * 2. jika Nilai >=100 maka dituliskan "Critical damage"
		 * 3. jika nilai <60, maka dituliskan "silahkan coba lagi"
		 * 
		 * 
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
			System.out.println("anda lulus");
		}
		else if (nilai > 100){
			System.out.println("Critical Damage");
		}
		else if (nilai < 60){
			System.out.println("Silahkan coba lagi ");
		}
	}
}
