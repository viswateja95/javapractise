//Write a program to print the table for the given number from 1 to 20.
package Basic50prgs;

import java.util.Scanner;

public class Prg36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		for(int i = 1; i<=20; i++) {
			 result = n*i;
			 System.out.println("multiplies of "+n +" is" +result);
		}
		
	}

}
