package pertemuan14;

public class MainMahasiswa {
	public static void main(String[]args) {
		Mahasiswa mhs1= new Mahasiswa();
		mhs1.inputNilai("223040077 ", "azhar ", 80 , 3.82 );
		System.out.println(mhs1.getNama()+ 
		"memiliki nrp " + mhs1.getNRP()
		+"dan nilai " + mhs1.getNilai() 
		+" ndengan ipk " +mhs1.getIPK());
		
		Mahasiswa mhs2= new Mahasiswa();
	}
}
