package Basic50prgs;

import java.util.Scanner;

//Write a program to read three positive numbers and print the min, max and average of the given.
public class prg6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		int d = (a+b+c)/3;
		System.out.println("Average of three numbers is:" +d);
		
		if(a>b && a>c) {
			System.out.println("max number is a " +a);
		}else if(b>c && b>a) {
			System.out.println("max number is b" +b);
		}else if(c>a && c>b) {
			System.out.println("max number is c" +c);
		}else {
			System.out.println("min value");
			
		}
		
	}

}
