package praUTS;
import java.util.Scanner;

public class setengahPiramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilaippppppppppppppppppppppppppppppppppppp: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
    
    
}
 
