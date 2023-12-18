package pertemuan14;

public class Buku {
/*
 * 
 * ini adalah record buku dinamakan record buku karena akan menangani nilai dari objek buku
 * 
 * atribut adalah nilai nilai yang dimiliki dari objek yang akan kita tangani ,karena buku memiliki nilai 
 * seperti judul, penerbit, pengarang, gendre,harga, dll.
 * maka atribut yang ada pada class buku mengikuti nilai tersebut 
 * 
 * atribut akan berbentuk variable global dalam kelas record
 * 
 */
	
	String sJudul;
	String sPenerbit;
	String sPenulis;
	int iHarga;
	
	//pastikan kita memiliki method untuk input nilai
	public void inputNilai(String judul, String penerbit, String penulis,int harga ) {
		sJudul = judul;
		sPenerbit = penerbit;
		sPenulis = penulis;
		iHarga = harga;
				
	}
	
	public String getJudul() {
		return sJudul;
	}
	public String getPenerbit() {
		return sPenerbit;
	}
	
	public String getPenulis() {
		return sPenulis;
	}
	
	public int getHarga() {
		return iHarga;
	}
}
