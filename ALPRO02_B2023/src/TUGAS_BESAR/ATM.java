package TUGAS_BESAR;

import java.util.Scanner;

public class ATM {

	public void menu() {
	    System.out.println("\n===== ATM Menu =====");
	    Scanner sc = new Scanner(System.in);

	    System.out.println("1. Lihat Saldo");
	    System.out.println("2. Tarik Tunai");
	    System.out.println("3. Simpan Tunai");
	    System.out.println("4. Exit");

	    if (sc.hasNextInt()) {
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Menu 1: Lihat Saldo");
	                break;
	            case 2:
	                System.out.println("Menu 2: Tarik Tunai");
	                break;
	            case 3:
	                System.out.println("Menu 3: Simpan Tunai");
	                break;
	            case 4:
	                System.out.println("Exiting ATM. Thank you!");
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    } else {
	        System.out.println("Invalid input. Please enter a number.");
	    }
	}

    

    public static void main(String[] args) {
        FileNasabah F = new FileNasabah();
        ATM A = new ATM();

    
        F.LoginNasabah();
        A.menu();
    }
}
