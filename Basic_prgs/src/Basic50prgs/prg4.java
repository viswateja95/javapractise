package Basic50prgs;

import java.util.Scanner;

//Write a program to check the given number for the divisibility of 3 & 4.
public class prg4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		if(a%3 == 0 && b%4 ==0 ) {
			System.out.println("Entered numbers are divisible by 3 and 4");
		}else {
			System.out.println("Entered numbers are not divisible by 3 and 4");
		}
		

	}

}
