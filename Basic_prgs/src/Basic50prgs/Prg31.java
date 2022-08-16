//Write a program to read series of numbers and print all prime, Armstrong and palindrome numbers.
package Basic50prgs;

import java.util.Scanner;

class Different{
	static boolean palindrome(int n) {
		int result = 0;
		int temp = n;
		while(n!=0) {
			int re = n%10;
			result = (result*10)+re;
			n/=10;
		}
		if(result == temp) {
			return true;
		}else
		return false;
	}
	boolean armstrongNumber(int i) {
		
		int temp, result = 0;
		temp = i;
		while(temp>0) {
			int re = temp%10;
			result += Math.pow(re, 3);
			temp/=10;
		}
		if(result == i)
			return true;
		else
					
		return false;
		
	}
	boolean primeNumber(int num) {
		for(int j = 2; j<=num/2; j++) {
			if(num%j == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Prg31 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Different df = new Different();
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		System.out.println("Different value for given "+n + " value is:");
		for (int i = 0; i <=n; i++) {
			if(df.palindrome(i)) {
				System.out.println("Executes Palindrome: "+i+" ");
				
			}
		}
		for(int i = 0; i<=n; i++) {
			if(df.armstrongNumber(i))
			System.out.print("Executes ArmstrongNumber: "+i+" ");
		}
		for(int i = 1; i<=n; i++) {
			
			if(df.primeNumber(i)) {
				System.out.println("Executes PrimeNumber: "+i+" ");
			}
		}
	
		
	}

}
