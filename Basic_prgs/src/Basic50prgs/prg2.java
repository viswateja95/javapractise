package Basic50prgs;

import java.util.Scanner;

//Write a program to print the average of the three given numbers
public class prg2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		
		int d = (a+b+c)/3;
		
		System.out.println("Average of three numbers:" +d);
		

	}

}
