package File;

import java.io.Serializable;

public class Mahasiswa implements Serializable {
    private int Nim;
    private String Nama;
    private double IPK;

    public Mahasiswa(int Nim, String Nama, double IPK) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.IPK = IPK;
    }

    public int getNim() {
        return Nim;
    }

    public String getNama() {
        return Nama;
    }

    public double getIPK() {
        return IPK;
    }

    // Metode dan atribut lainnya
}
