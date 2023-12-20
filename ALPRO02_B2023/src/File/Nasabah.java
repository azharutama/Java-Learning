package File;

import java.io.Serializable;
import java.util.Scanner;


public class Nasabah implements Serializable {
	
    private int Nim;
    private String Nama;
    private double IPK;

    
    void BacaNilai() {
		Scanner sc=new Scanner (System.in);
		System.out.println("NIM :");
		 Nim =sc.nextInt();
		 System.out.println("Nama :");
		 Nama =sc.next();
		 System.out.println("UTS:");
		
		}
	
	void TulisNilai() {
		
		System.out.println("NIM :" + Nim);
		 
		 System.out.println("Nama :" + Nama);
		
		
		
		}
	
	
    public Nasabah(int Nim, String Nama, double IPK) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.IPK = IPK;
    }

    public int getNim() {
        return Nim;
    }
    public int setNim() {
        return Nim;
    }

    public String getNama() {
        return Nama;
    }
    
    public String setNama() {
        return Nama;
    }

    public double getIPK() {
        return IPK;
    }

    // Metode dan atribut lainnya
}
