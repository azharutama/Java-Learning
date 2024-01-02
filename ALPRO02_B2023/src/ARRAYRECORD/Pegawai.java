package ARRAYRECORD;
import java.util.Scanner;
public class Pegawai {
	


	
		int Nip ;
		String Nama;
		int jim;
		int jit;
		double gaji;
	
	
		
	
		public Pegawai(int nip2, String nama2, int jim2, int jit2, double gaji2) {
			// TODO Auto-generated constructor stub
		}

		void BacaNilai() {
			Scanner sc=new Scanner (System.in);
			System.out.println("NIP :");
			 Nip =sc.nextInt();
			 System.out.println("Nama :");
			 Nama =sc.next();
			 System.out.println("jim:");
			 jim =sc.nextInt();
			 System.out.println("jit :");
			 jit =sc.nextInt();
			 gaji= 10000*jim-10000*jit;
			 
			
			}
		
		void TulisNilai() {
			
			System.out.println("NIM :" + Nip);
			 
			 System.out.println("Nama :" + Nama);
			
			 System.out.println("masuk :" + jim);
			 
			 System.out.println("tidak masuk :" + jit);
			 
			 System.out.println("gaji :" + gaji);
			 
			
			 
			
			}
	}



