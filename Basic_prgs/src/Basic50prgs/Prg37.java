//Write a program to check the given number for Fibonacci number
package Basic50prgs;

import java.util.Scanner;

class Fabinocci{
	static boolean isPerfect(int num) {
		int s = (int)Math.sqrt(num);
		return(s*s==num);
	}
	static boolean isFabinocci(int n) {
		return isPerfect(5*n*n+4)|| isPerfect(5*n*n-4);
		
	}
	
}

public class Prg37 {

	public static void main(String[] args) {
		Fabinocci fb = new Fabinocci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int b = sc.nextInt();
		if(fb.isFabinocci(b))
			System.out.println(b+ " is a fabinocci number");
		else
			System.out.println(b+ " is not a fabinocci number");
		
	}

}
