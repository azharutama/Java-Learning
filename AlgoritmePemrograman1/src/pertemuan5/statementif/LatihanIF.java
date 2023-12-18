package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIF {
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
	 * tersebut >= 60, jika iya maka akan muncul statement "anda lulus"
	 * 
	 */
	Scanner sc = new Scanner (System.in);
			
			int nilai;
			System.out.print("masukan nilai : ");
			nilai= sc.nextInt();
			
			if(nilai >= 60) {
				System.out.println("anda lulus");
			}
}
}
