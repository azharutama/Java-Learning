package ARRAYRECORD;

import java.util.Scanner;

public class ArrNilai {
 int N=2;
 Nilai[] a= new Nilai[N];
 
 
 void IsiArray() {
	 Nilai x;
	 Scanner sc=new Scanner (System.in);
	 for(int i=0; i<N;i++) {
		 x = new Nilai();
	 System.out.println("masukan value " +i+ ":");
	 x.BacaNilai();
	 a[i]=x;
	 }
 }
 
 

	 void TampilArray() {
			for(int i=0; i < N ;i++) {
			 System.out.println("el array ke " +i+ ":" +a[i]);
			 a[i].TulisNilai();
			 }
		 }

	 
//	 System.out.println("el array ke " +i+ ": " +a[i] . Nim +a[i] . Nama+a[i].Ipk );
	 
	
	
	
 

 
 int SeqSearch2(int x) {
		int i;
		i=0;
		
		while ((i < N-1) && (a[i].Nim!=x)){
			i=i+1;
					
		}
		
		if (a[i].Nim==x) 
			return i;
		else
			return -1;
		
	}

// int BinarySearch(int x) {
//	 int awal=0,akhir=N,k;
//		boolean ketemu=false;
//		
//		while ((awal <= akhir ) && (ketemu==false)){
//			k=(awal+akhir)/2;
//					
//		}
//		
//		if (a[k].Nim==x) 
//			ketemu=true;
//		else if (a[k].Nim>x)
//			awal=k=1;
//		else 
//			akhir=k-1;
//			
//		
//	}

 void selectionSortSMALLtoBIG() {
		int i,imaks;
		Nilai temp= new Nilai();
		for (int pas =1 ; pas <=N-1; pas++) {
			imaks =0;
			for(int i1=1; i1<=N-pas;i1++) {
				
				if (a[imaks].Nim <a[i1].Nim)
				{
					imaks=i1;
				}
				temp=a[imaks];
				a[imaks]=a[N-pas];
				a[N-pas]=temp;
				
			}
		}
	}

	void selectionSortBIGtoSMALL() {
		int i,imaks;
		Nilai temp= new Nilai();
		for (int pas =1 ; pas <=N-1; pas++) {
			imaks =0;
			for(int i1=1; i1<=N-pas;i1++) {
				
				if (a[imaks].Nim >a[i1].Nim)
				{
					imaks=i1;
				}
				temp=a[imaks];
				a[imaks]=a[N-pas];
				a[N-pas]=temp;
				
			}
		}
	}
	


	int binarySearch(int x) {
	    int awal = 0, akhir = N - 1, k, i = 0;  // Declare i and initialize it to 0
	    boolean ketemu = false;

	    while ((awal <= akhir) && (ketemu == false)) {
	        k = (awal + akhir) / 2;
	        i = i + 1;

	        if (a[k].Nim == x) {
	            ketemu = true;
	        } else if (a[k].Nim < x) {
	            awal = k + 1;
	        } else {
	            akhir = k - 1;
	        }
	    }

	    if (ketemu) {
	        return 1 ;
	    } else {
	        return -1;
	    }
	}
	
	void BubleSort() {
		Nilai temp=new Nilai();
			for(int i=0; i<=N-1; i++) {
				for (int k=N-1; k>=i+1; k--) {
					if (a[k].Nim<a[k-1].Nim) {
						temp = a[k];
						a[k]=a[k-1];
						a[k-1]=temp;
					}
				}
				
				
			}
						
		}
public static void main(String[]args) {
	ArrNilai A=new ArrNilai();
	ArrNilai B=new ArrNilai();
    A.IsiArray();
    A.TampilArray();
    A.selectionSortBIGtoSMALL();
    A.TampilArray();
//    A.selectionSortBtoS();
//    A.TampilArray();
    
//    int ix=A.binarySearch(5);
//    System.out.println("Data ketemu di indeks: "+ ix);
//   
}
}