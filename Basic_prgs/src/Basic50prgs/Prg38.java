//Write a program to print the Fibonacci series for the given number of terms.
package Basic50prgs;

import java.util.Scanner;

public class Prg38 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number:");
		int n = sc.nextInt();
		int n1 =0,n2=1,sum = 0;
		System.out.println(n1+" "+ n2+" ");
		for(int i=1; i<=n; i++) {
			sum = n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum +" ");
		}
		
		
	}

}
