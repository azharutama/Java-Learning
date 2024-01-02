package File;

import java.util.Scanner; 

public class Mahasiswa  implements java.io.Serializable { 
 	int nim;  	String nama;  	float ipk; 
 	 
 	Mahasiswa(){ 
 	 	 
 	} 
 	 
    Mahasiswa(int mynim, String mynama, float myip ){      	nim=mynim;      	nama=mynama; 
     	ipk=myip; 
 	 	 
 	} 
 	 
 	void BacaMahasiswa() {  	 	Scanner sc= new Scanner(System.in); 
 	 	System.out.print("nim: "); nim=sc.nextInt(); 
 	 	 System.out.print("nama: "); nama=sc.next(); 
 	 	 System.out.print("ipk: "); ipk=sc.nextFloat(); 
 	} 
 	 
 	void TampilMahasiswa() {  	 	System.out.println("Data: " 
                +nim+","+nama+","+ipk); 
 	} 
 	 
 	int getNim() { 
 	 	return nim; 
 	} 
 	 
 	 String getNama() { 
 	 	 return nama; 
 	 } 
  
 float getIPK() { 
	 	 return ipk; 
 } 
 
 void setNim(int a) { 
	 	 	nim=a; 
 	  } 
 	 	 
 	void setNama(String a) { 
 	 	 	nama=a;  	} 
 	 	  
 	void setIPK(float a) { 
 	 	 	  ipk=a; 
 	} 
 	  
 
} 
