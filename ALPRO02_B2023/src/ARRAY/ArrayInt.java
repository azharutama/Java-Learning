package ARRAY;

import java.util.Scanner;

public class ArrayInt {
 int N=5;
 int[] a= new int[N];
 
 void IsiArray() {
	 Scanner sc=new Scanner (System.in);
	 for(int i=0; i<N;i++) {
	 System.out.println("el array ke " +i+ ":");
	 a[i]=sc.nextInt();
	 }
 }
 
 void TampilArray() {
	for(int i=0; i < N ;i++) {
	 System.out.println("el array ke " +i+ ":" +a[i]);
	 
	 }
 }

 void hitungRata() {
	 double Total=0,Rata=0;
		for(int i=0; i<N;i++) {
		 Total= Total+a[i];
		 }
		Rata=Total/N;
		System.out.println("Nilai Rata Rata = " +(Rata));
	 }
 
 void hitungMaks() {
	 int maks= 0;
		for(int i=0; i<N;i++) {
		 if(a[i]>maks);
		 maks=a[i];
		 }
		
		System.out.println("nilai maks: " +maks);
	 }
 
 
 void hitungMaksII() {
	 int imaks= 0;
		for(int i=0; i<N;i++) {
		 if(a[i]>a[imaks]);
		 imaks=i;
		 }
		
		System.out.println("nilai maks II: " +imaks);
	 }

 
int GetElement(int i) {
	return  a[i];
}

void SetELement(int i, int x) {
	Scanner sc= new Scanner (System.in);
	a[i]=x;
}
static void SalinLarik(ArrayInt A, ArrayInt B) {
	int x;
	for (int i=0; i< A.N; i++) {
		x= A.GetElement(i);
		B.SetELement(i, x);
	}
	B.TampilArray();
}

int Get(int i) {
	return  a[i];
}

void Set(int i, int x) {
	
	a[i]=x;
}

static void IsSama(ArrayInt A, ArrayInt B) {
	boolean sama = true;
	int i = 0;
	
	while (( i<A.N) && (sama==true)){
		
		
		if (A.Get(i)==B.Get(i)) {
			 i=i+1;
		}else {
			 sama = false;
		}
			
		
		System.out.println("sama = " + sama);
	}

}



int SeqSearch2(int x) {
	int i;
	i=0;
	
	while ((i < N-1) && (a[i]!=x)){
		i=i+1;
				
	}
	
	if (a[i]==x) 
		return i;
	else
		return -1;
	
}

int binarySearch(int x) {
    int awal = 0, akhir = N - 1, k, i = 0;  // Declare i and initialize it to 0
    boolean ketemu = false;

    while ((awal <= akhir) && (ketemu == false)) {
        k = (awal + akhir) / 2;
        i = i + 1;

        if (a[k] == x) {
            ketemu = true;
        } else if (a[k] < x) {
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


void selectionSortSMALLtoBIG() {
	int i,imaks;
	int temp;
	for (int pas =1 ; pas <=N-1; pas++) {
		imaks =0;
		for(int i1=1; i1<=N-pas;i1++) {
			
			if (a[imaks]<a[i1])
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
	int temp;
	for (int pas =1 ; pas <=N-1; pas++) {
		imaks =0;
		for(int i1=1; i1<=N-pas;i1++) {
			
			if (a[imaks]>a[i1])
			{
				imaks=i1;
			}
			temp=a[imaks];
			a[imaks]=a[N-pas];
			a[N-pas]=temp;
			
		}
	}
}

void BubbleSort() {
	
	for (int i =0; i< N-1;i++) {
		for(int k=0; k<N-i-1;k++) {
			
			if (a[k] > a[k+1])
			{
				int temp=a[k];
				a[k]=a[k+1];
				a[k+1]=temp;
			}
			
			
		}
	}
}



void BubleSort2() {
	
	for(int i=0; i<=N-1; i++) {
		for (int k=N-1; k>=i+1; k--) {
			if (a[k]<a[k-1]) {
				int temp = a[k];
				a[k]=a[k-1];
				a[k-1]=temp;
			}
		}
		
		
	}
				
}


void InsertsionSort() {
	int i=0 ,j = 0,y = 0;
	boolean ketemu;
	for( i=1;i<= N;i++ ) {
		
	y=a[i];
	j=i-1;
	ketemu=false;
	 
	while ((j>= 1)&&(ketemu=false)  ) {
		
			if (y < a[j]) {
				a[j+1]=a[j];
				j=j-1;
		}else {
			ketemu=true;
		}
	}
	
				
}
}
public static void main(String[]args) {
	ArrayInt A=new ArrayInt();
	ArrayInt B=new ArrayInt();
    A.IsiArray();
    A.TampilArray();
//    SalinLarik(A, B);
//    A.selectionSortSMALLtoBIG();
//    A.TampilArray();
//    System.out.println("urutan besar ke kecil");
    A.InsertsionSort();
    A.TampilArray();
//    int ix=A.binarySearch(5);
//    System.out.println("Data ketemu di indeks: "+ ix);
//  
//    A.hitungMaks();
//    A.hitungMaksII();
//    IsSama(A  , B );1
      
//    
//    int ix=A.binarySearch(3);
//    System.out.println("Data ketemu di indeks: "+ ix);
    
   
}
}