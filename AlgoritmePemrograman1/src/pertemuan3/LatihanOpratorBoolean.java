package pertemuan3;

public class LatihanOpratorBoolean {

	public static void main(String []args) {
		
		/* boolean adalah oprator yang digunakan untuk kondisi true or false 
		 * 
		 * == perbandingan bukan string
		 * != tidak sama dengan string 
		 * < untuk lebih kecil
		 * <= untuk lebih kecil sama dengan 
		 * > untuk lebih besar
		 * < untuk lebih kecil
		 * >= untuk lebih besar sama dengan
		 * equalsignireCase() untuk perbandingan string
		 * 
		 */
		
		String a = "abcd";
		
		System.out.println (5==5);//true
		System.out.println (5!=2);//true
		System.out.println (5<5);//false
		System.out.println (5<=5);//true
		System.out.println (5>5);//false
		System.out.println (5>=5);//true
		System.out.println (a.equalsIgnoreCase("ABCD"));//true case non sensitive
		System.out.println (a.equals("ABCD"));//false case sensitive
		
		
	}
	
	
}
