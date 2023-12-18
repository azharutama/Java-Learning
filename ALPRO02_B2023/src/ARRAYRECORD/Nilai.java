package ARRAYRECORD;

import java.util.Scanner;

public class Nilai {
	int Nim ;
	String Nama;
	double UTS;
	double UAS;
	double Praktikum;
	double NilaiAkhir;
	double NA;
	char idx;
	
void HitungNA() {
	
	NA = 0.3*UTS +0.45*UAS+0.25*Praktikum;
	
}
void SetIndex() {
	if (NA>=80)
		idx= 'A';
	else if(NA>=70)
		idx= 'B';
	else if(NA>=50)
		idx= 'C';
	else if(NA>=40)
		idx= 'D';
	else
		idx= 'E';
	
}
	void BacaNilai() {
		Scanner sc=new Scanner (System.in);
		System.out.println("NIM :");
		 Nim =sc.nextInt();
		 System.out.println("Nama :");
		 Nama =sc.next();
		 System.out.println("UTS:");
		 UTS =sc.nextDouble();
		 System.out.println("UAS :");
		 UAS =sc.nextDouble();
		 System.out.println("Praktikum :");
		 Praktikum =sc.nextDouble();
		 System.out.println("Nilai AKhir :");
		 NilaiAkhir =sc.nextDouble();
		 System.out.println("Index :");
		
		}
	
	void TulisNilai() {
		
		System.out.println("NIM :" + Nim);
		 
		 System.out.println("Nama :" + Nama);
		
		 System.out.println("UTS :" + UTS);
		 
		 System.out.println("UAS :" + UAS);
		 
		 System.out.println("Praktikum :" + Praktikum);
		 
		 System.out.println("Nilai akhir :" + NilaiAkhir);
		 
		 System.out.println("Nilai  :" );
		 HitungNA(); 
		
		}
	
}
