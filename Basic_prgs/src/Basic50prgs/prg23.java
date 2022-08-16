//Write a program to reverse the given number
package Basic50prgs;

import java.util.Scanner;

public class prg23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		int a = sc.nextInt();
		int r = 0;
		
		while(a!=0) {
			int re = a%10;
			 r = r*10 + re;
			 a= a/10;
		}
		
		System.out.println("given number is reversed:" +r );
		
	}

}
