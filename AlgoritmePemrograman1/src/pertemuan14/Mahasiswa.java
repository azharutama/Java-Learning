package pertemuan14;

public class Mahasiswa {
	String sNRP;
	String sNama;
	int iNilai;
	double dIPK;
	
	public void  inputNilai(String nrp,String nama, int nilai, double ipk) {
		sNRP = nrp;
		sNama = nama;
		iNilai = nilai;
		dIPK = ipk;
		
		
				
	}
	
	public String getNRP() {
		return sNRP;
	}
	
	public String getNama() {
		return sNama;
	}
	
	public int getNilai() {
		return iNilai;
	}
	
	public double getIPK() {
		return dIPK;
	}
}
