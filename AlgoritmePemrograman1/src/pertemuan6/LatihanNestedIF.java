package pertemuan6;

import java.util.Scanner;

public class LatihanNestedIF {
/* 
 * nested if adalah bentuk percabangan dedngan statement if, 
 * dimana akan ada if(child)di dalam if (parentnya)
 * 
 * formatnya
 * if(syarat 10 {
 * jika memenuhi syarat 1
 * 
 * if(syarat a){
 * jika memenuhi syarat a
 * }else if (syarat b){
 * jika memenuhi syarat b
 * }....hingga syarat ke-n
 * 
 * }else{
 * jika tidak memenuho syarat 1
 * }
 * 
 * contih soal
 * buatla program penerimaan siswa di tk montekar , dimana terdapat syarat yaitu :
 * 1. anak yang diterima adalah siswa yang memiliki umur 5-7 tahun , jika iya maka akan ada syarat berikutnya :
 * a.jika anak berumur 5 tahun maka muncul "kelas A"
 * b. jika anak berusia 6-7 tahun maka akan muncul "kelas B"
 * 
 * 2. selain umur 5-7 tahun akan ditolak
 * 
 
 
 */
public static void main(String[] args) {
	Scanner sc = new Scanner  (System.in);
	int usia;
	
	System.out.print("masukan usia anak anda : ");
	usia = sc.nextInt();
	
	if ((usia >= 5) && (usia<=7)) {
		System.out.println("anak anda diterima");
		if(usia ==5) {
			System.out.println("masuk kelas A");
		}else {
			System.out.println("masuk kelas B");
		}
	} else { System.out.println("anak anda ridak diterima");
 }

}
}
