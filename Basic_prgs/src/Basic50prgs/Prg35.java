//Write a program to find out the factorial of the given number eg: 3! = 3*2*1
package Basic50prgs;

import java.util.Scanner;

public class Prg35 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact =1; 
		for(int i = 1; i<=n; i++) {
			fact*=i;
		}
		System.out.println("factorial of "+n +" is:" +fact);

	}

}
