package pertemuan12;

public class NestedLoop3 {
	public static void main(String[] args) {
		
		for (int b = 1; b <=5 ; b++) {
			//loop semua baris
			for (int a = 1; a <=b; a++) {
				//loop tiap baris
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
