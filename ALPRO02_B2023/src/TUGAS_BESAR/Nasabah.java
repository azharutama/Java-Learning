package TUGAS_BESAR;

import java.io.Serializable;

public class Nasabah implements Serializable {
    private int norek;
    private String Nama;
    private double saldo;
    private String pin;
    
    

    public Nasabah(int norek, String Nama, double saldo,String pin) {
        this.norek = norek;
        this.Nama = Nama;
        this.saldo = saldo;
    }

    public Nasabah() {
		// TODO Auto-generated constructor stub
	}

	public int getnorek() {
        return norek;
    }

    public String getNama() {
        return Nama;
    }

    public double getsaldo() {
        return saldo;
    }
    public String getpin() {
        return pin;
    }

    // Metode dan atribut lainnya
}
