package Practise;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		
		for(int i = 1; i<= num; i++) {
			int count=0;
			for(int j = 2; j<=i/2; j++) {
				if(i%j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
	}

}
