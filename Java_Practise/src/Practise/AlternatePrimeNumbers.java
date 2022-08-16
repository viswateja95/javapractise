package Practise;

import java.util.Scanner;

class Prime{
	static int prime(int num) {
		int flag =0;
		for(int i =2; i<=num/2; i++) {
			if(num%i == 0) {
				flag =1;
				break;
			}
		}
		if(flag == 0) {
			return 1;
		}else
		return 0;
	}
	static void altPrime(int n) 
	{
		int temp =2;
		for(int num = n; num <= n-1; num++) 
		{
			if(prime(num) ==1) 
			{
				if(temp%2 == 0) 
					System.out.println(num +" ");
					temp ++;
				
			}
		}
	}
}

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
		Prime pn = new Prime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		System.out.println("Alternate Prime Number for " +num +" is: ");
		pn.altPrime(num);
		
	}

}
