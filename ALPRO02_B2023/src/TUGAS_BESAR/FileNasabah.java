package TUGAS_BESAR;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.FileInputStream; // Added import for ObjectInputStream

public class FileNasabah {

    void SaveToFile() {
        int norek = 0 ;
        String Nama = null;
        double saldo = 0;
        String pin = null;
        Nasabah R = new Nasabah(norek, Nama, saldo,pin);

        System.out.println("===== SaveToFile =====");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("C:\\DATAKU\\Nasabah.dat"+ ""));

            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan norek: ");
            norek = sc.nextInt();
            while (norek != 999) {
                System.out.print("Masukan Nama: ");
                Nama = sc.next();
                System.out.print("Masukan saldo: ");
                saldo = sc.nextDouble();
                out.writeObject(R);
                System.out.print("Masukan norek: ");
                norek = sc.nextInt();
                System.out.print("Masukan pin: ");
                pin = sc.next();
                R = new Nasabah(norek, Nama, saldo,pin);
            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void BacaFile() {
        System.out.println("===== BacaFile =====");
        ObjectInputStream in = null;
        int total = 0;
        Nasabah R;
        try {
            in = new ObjectInputStream(new FileInputStream("C:\\DATAKU\\Nasabah.dat" + ""));
            Object curR = in.readObject();
            while (curR != null) { // Termination condition
                R = (Nasabah) curR;
                System.out.println("norek: " + R.getnorek());
                System.out.println("Nama: " + R.getNama());
                System.out.println("saldo: " + R.getsaldo());
                total++;
                curR = in.readObject();
            }
            in.close();
        } catch (EOFException e) {
            System.out.println("TOTAL= " +total);
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions appropriately
            e.printStackTrace();
        }
    }
    
    

  

        void LoginNasabah() {
            System.out.println("===== LoginNasabah =====");
            ObjectInputStream in = null;
            boolean ketemu = false;
            Nasabah R = new Nasabah(); // Assuming Nasabah has a default constructor

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Masukan norek: ");
                int norekC = sc.nextInt();
                System.out.print("Masukan pin: ");
                String pinC = sc.next();

                try {
                    in = new ObjectInputStream(new FileInputStream("C:\\DATAKU\\Nasabah.dat"));
                    Object curR = in.readObject();

                    while (curR != null) { // Termination condition
                        R = (Nasabah) curR;
                        int curnorek = R.getnorek();
                        String curpin = R.getpin();

                        if (curpin.equals(pinC) && curnorek == norekC) {
                            ketemu = true;
                            break; // No need to continue reading once found
                        } else {
                            curR = in.readObject();
                        }
                    }

                    if (ketemu) {
                        System.out.println("Login berhasil!");
                        // Additional logic for a successful login, if needed
                    } else {
                        System.out.println("Norek atau pin salah.");
                    }

                } catch (EOFException e) {
                    System.out.println("Akhir file. Tidak ketemu.");
                }

            } catch (IOException | ClassNotFoundException e) {
                // Handle exceptions appropriately
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        
    

    public static void main(String[] args) {
        FileNasabah F = new FileNasabah();
        F.SaveToFile();
        F.BacaFile();
        F.LoginNasabah();
    }
}