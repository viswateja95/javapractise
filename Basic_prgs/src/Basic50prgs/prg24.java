//Write a program to check the given number for palindrome number
package Basic50prgs;

import java.util.Scanner;

public class prg24 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");

		int a = sc.nextInt();
		int r = 0;
		int temp = a;
		
		while (a !=0) {
			
			int re = a%10;
			r = (r*10) + re;
			a = a/10;
			
		}
		if(temp == r) {
			System.out.println("provided number is palindrome: " +r);
		}else {
			System.out.println("provided number is not palindrome");
		}
		
	
	}
}
