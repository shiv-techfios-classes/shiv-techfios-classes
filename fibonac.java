import java.util.Scanner;

class fibonacci{

/**
static int fibo(int n) {

 if(n<=1)
	return n;

 return fibo(n-1)+fibo(n-2);


} 
*/


public static void main(String[] args) {


Scanner scin = new Scanner(System.in);

System.out.println("Enter the number of fibonacci items to see:");

int terms = scin.nextInt();

double n1 =0, n2=1, next=n1+n2;

for(int i=0; i<terms; i++) {

//  System.out.print(fibo(i) +" ");
  System.out.print(String.format("%.0f", n1) +" ");
next=n1+n2;
n1=n2;
n2=next;

}

}
}