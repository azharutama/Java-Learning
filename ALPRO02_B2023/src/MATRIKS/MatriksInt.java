package MATRIKS;

import java.util.Iterator;
import java.util.Scanner;

public class MatriksInt {
 int N=3;int M= 3;
 int[] [] a= new int[N][M];
 
 void IsiMatriks() {
	 Scanner sc=new Scanner (System.in);
	 for(int i=0; i<N;i++) {
		 for (int j=0; j<M;j++) {
			 System.out.println("masukan value " +i+ "," +j+ ":");
			 a[i][j]=sc.nextInt();
		 }
	
	 }
 }
 
 void TampilMatriks() {
	for(int i=0; i < N ;i++) {
		for(int j=0; j < M ;j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	 
	 }
 }

 
 
 
int GetElement(int i,int j) {
	return  a[i][j];
}

void SetELement(int i, int j, int x) {
	Scanner sc= new Scanner (System.in);
	a[i][j]=x;
}
static void SalinMatriks(MatriksInt A, MatriksInt B) {
	int x;
	for (int i=0; i< A.N; i++) {
		for (int j=0; j< A.M; j++) {
			x= A.GetElement(i,j);
			B.SetELement(i,j, x);
		}
		
		
	}
	B.TampilMatriks();
}

int Get(int i, int j) {
	return  a[i][j];
}

void Set(int i, int j ,int x) {
	
	a[i][j]=x;
}

//static void IsSama(MatriksInt A, MatriksInt B) {
//	boolean sama = true;
//	int i = 0;int j;
//	
//	while (( i<A.N) && (sama==true)){
//		j=0;
//		
//		if (A.Get(i)==B.Get(i)) {
//			 i=i+1;
//		}else {
//			 sama = false;
//		}
//			
//		
//		System.out.println("sama = " + sama);
//	}
//
//}
//
static MatriksInt TambahMatriks(MatriksInt A, MatriksInt B) {
    MatriksInt T = new MatriksInt();
    int x, y;
    for (int i = 0; i < A.N; i++) {
        for (int j = 0; j < A.M; j++) {
            x = A.GetElement(i, j);
            y = B.GetElement(i, j);
            T.SetELement(i, j, x + y);
        }
    }
    return T; 
}

static MatriksInt PenguranganMatriks(MatriksInt A, MatriksInt B) {
	
	MatriksInt C = new MatriksInt();
	int x,y;
	for (int i=0; i< A.N; i++) {
		for (int j=0; j< A.M; j++) {
			x= A.GetElement(i,j);
			y= B.GetElement(i,j);
			C.SetELement(i,j, x-y);
			
		}
		
	}
	B.TampilMatriks();
	return C;
	
}


static MatriksInt PerkalianMatriks(MatriksInt A, MatriksInt B) {
    MatriksInt T = new MatriksInt();
    int x, y;
    for (int i = 0; i < A.N; i++) {
        for (int j = 0; j < A.M; j++) {
            x = A.GetElement(i, j);
            y = B.GetElement(i, j);
            T.SetELement(i, j, x * y);  // Perubahan disini, ubah penjumlahan menjadi perkalian
        }
    }
    return T; 
}


    public static MatriksInt PerkalianDiagonal(MatriksInt A, MatriksInt B) {
        if (A.N != B.N || A.M != B.M) {
            
            System.out.println("Error: Dimensi matriks tidak sesuai untuk perkalian diagonal.");
            return null; 
        }

        MatriksInt T = new MatriksInt();
        int x, y;
        for (int i = 0; i < A.N; i++) {
            for (int j = 0; j < A.M; j++) {
                if (i == j) {
                    x = A.GetElement(i, j);
                    y = B.GetElement(i, j);
                    T.SetELement(i, j, x * y);
                }
            }
        }
        return T;
    }
    
public static void main(String[]args) {
	MatriksInt A=new MatriksInt();
	MatriksInt B=new MatriksInt();
	MatriksInt C=new MatriksInt();
	MatriksInt D=new MatriksInt();
    A.IsiMatriks();
    A.TampilMatriks();
    
    B.IsiMatriks();
    B.TampilMatriks();
   
    
//    
    C=PerkalianDiagonal(A,B);
    System.out.println("hasil perkalian Matriks");
    C.TampilMatriks();
//    
    
//    System.out.println("hasil pengurangan: ");
//    C=PenguranganMatriks(A,B);
//    
   
}
}