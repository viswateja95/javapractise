package Basic50prgs;

import java.util.Scanner;

//Write a program to check the given number for even or odd

public class prg3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int a = sc.nextInt();
		if(a%2 ==0) {
			System.out.println("Entered number is even");
		}else {
			System.out.println("Entered number is odd");
		}
		
		

	}

}
