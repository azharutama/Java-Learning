package pertemuan12;

public class Nestenloop1 {
	public static void main(String[] args) {

		/*
		 * 
		 * buatlah program yang menghasilkan output :
		 * 
		 *
		 */
		for (int z = 1; z <= 5; z++) {
			//loop semua baris
			for (int a = 1; a <= 5; a++) {
				//loop tiap baris
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
