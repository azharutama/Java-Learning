package ARRAY;

import java.util.Scanner;

public class ArrayOfChar {
 static int N=5;
static char[] a= new char[N];
 
 void IsiArray() {
	 Scanner sc = new Scanner (System.in);
	 System.out.print("Masukan Value :" );String S=sc.nextLine();
	 int l=S.length(); System.out.println("panjang string :" +l);
	 for(int i=0; i<S.length();i++) {
	 a[i]=S.charAt(i);
	 }
 }
 
 void TampilArray() {
	for(int i=0; i < N ;i++) {
	 System.out.println("array ke " +i+ ":" +a[i]);
	 
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

void SetELement(int i, char x) {
	Scanner sc= new Scanner (System.in);
	a[i]=x;
}
static void SalinLarik(ArrayOfChar A, ArrayOfChar B) {
	char x;
	for (int i=0; i< A.N; i++) {
		x= (char) A.GetElement(i);
		B.SetELement(i, x);
	}
	B.TampilArray();
}

int Get(int i) {
	return  a[i];
}

void Set(int i, char x) {
	
	a[i]=x;
}

static void IsSama(ArrayOfChar A, ArrayOfChar B) {
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

static void Palindrome() {
	  	boolean lanjut = true;
		 int i= 0;
			while((i<N/2) && (lanjut==true)) {
			 if(a[i]==a[N-i-1])
			    i++;
			    else 
			    	lanjut =false;
			 }
			
			System.out.println("masukan Value : " + lanjut);
		 }



static void ReverseString (ArrayOfChar A, ArrayOfChar B) {
	char x;
	for (int i=0; i< A.N; i++) {
		x= (char) A.GetElement(i);
		B.SetELement(A.N-i-1, x);
	}
	B.TampilArray();
}

void CariMaks1dan2() {
	int imax1=0;
	for(int i=1; i<N; i++) {
		if(a[i]>a[imax1]) {
			imax1=i;
			
		}
	}
	
	int imax2=0;
	for(int i=1; i<N; i++) {
		if(a[i]>a[imax2]) {
			if(i!=imax1) {
				imax2=i;
			}
			
		}
		System.out.println("nilai terbesar pertama = " +a[imax1]);
		System.out.println("nilai terbesar pertama = " + imax1);
		System.out.println("nilai terbesar pertama = "+ a[imax2]);
		System.out.println("nilai terbesar pertama = " + imax1);
	}
}

public static void main(String[]args) {
	ArrayOfChar A=new ArrayOfChar();
	ArrayOfChar B=new ArrayOfChar();
	ArrayOfChar C=new ArrayOfChar();
	
    A.IsiArray();
    A.TampilArray();
    A.Palindrome();
    ReverseString(A, C);
    SalinLarik(C, A);
////    A.hitungMaks();
////    A.hitungMaksII();
//    
//    System.out.println("array B");
//    B.IsiArray();
//    B.TampilArray();
//    
//    System.out.println("sama ? "+ IsSama(A  , B ));
//   
   
}
}