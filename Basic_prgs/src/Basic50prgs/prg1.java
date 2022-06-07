package Basic50prgs;
//Write a program to print the product of two given numbers
import java.util.Scanner;

public class prg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("Product of two numbers:"+c);

	}

}
