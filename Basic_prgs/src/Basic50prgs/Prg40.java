//Write a program to print the alphabets from A-­‐Z in reverse.
package Basic50prgs;

import java.util.Scanner;

public class Prg40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		while(c<='Z' && c>='A' ) {
			
			System.out.println("print A-Z in reverse: " +c);
			c--;
		}
		
		
		
	}

}
