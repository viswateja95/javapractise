//Print given number is prime number number divide by it self eg:2,5,7,11,13,17,19,23,29,31,
package Basic50prgs;

import java.util.Scanner;

public class Prg28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value: ");
		int a = sc.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i<=a/2; i++) {
			if(a%i == 0) {
				
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(a +" is a prime number");
		}
		else {
			System.out.println(a +"is not a prime number");
		}
	}

}
