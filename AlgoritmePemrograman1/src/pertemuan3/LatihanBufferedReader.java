package pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LatihanBufferedReader {
	public static void main (String []args) {
		/*  
		 * buffered reader adalah fungsi fungsi input yang lebih kuno dari scanner tetapi memiliki 
		 * 
		 * 
		 */
		
		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 try {
			System.out.print("Nama :"); 
			String sNama = br.readLine();
			
			System.out.print("Nilai :"); 
			int iNilai = Integer.parseInt(br.readLine());
			
			
			
			System.out.println("Nilai :" + sNama); 
			System.out.println("Nilai :" + iNilai); 
			
		 }
		 catch(Exception e){
			System.err.println("Nilai harus angka"); 
		 }
	}

}
