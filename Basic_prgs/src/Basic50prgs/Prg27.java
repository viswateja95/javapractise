//Write a program to print first 5 Armstrong numbers after 100.
package Basic50prgs;

import java.util.Scanner;

class Series{
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
}

public class Prg27 {

	public static void main(String[] args) {
		Series arm = new Series();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int r = sc.nextInt();
		System.out.println("Series for given Armstrong number" +r +" ");
		for(int i = 100; i<=r; i++) {
			if(arm.armstrongNumber(i))
			System.out.println(i);
		}

	}

}
