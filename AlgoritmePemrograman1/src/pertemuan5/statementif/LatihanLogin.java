package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String user,pass;
		
		System.out.print(" username: ");
		user = sc.next();
		
		System.out.print(" password: ");
		pass = sc.next();
		
		
		if( (user.equalsIgnoreCase("admin")) && (pass.equalsIgnoreCase("1234"))){
		
		System.out.println(" selamat datang " + user );
	}else {
		System.out.println("anda siapa");
	}
}}
