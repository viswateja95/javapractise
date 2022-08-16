//Write a program to print alternative prime numbers between 1 and 100 in reverse direction.
package Basic50prgs;

import java.util.Scanner;

class Prime{
	boolean PrimeNumber(int n) {
		boolean prime = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	void  reverseAltPrime(int n) {
		boolean flag = true;
		for(int i = n; i>=1; i--) {
			if(PrimeNumber(i)) {
				if(flag)
                {
                    System.out.print(i+" ");
                    flag = false;
                }
                else if(flag==false)
                    flag = true;
			}
			
		}
		
	}
}


public class Prg30 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Prime pn = new Prime();
		System.out.println("Enter the value: ");
		int n = s.nextInt();
		System.out.println("reverse alternate Prime number for " +n +" is: ");
		pn.reverseAltPrime(n);
		
		
	}

}
