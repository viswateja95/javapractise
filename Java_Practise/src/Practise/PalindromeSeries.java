package Practise;

import java.util.Scanner;

class SeriesPalindrome{
	boolean palindromeSeries(int n) {
		int temp = n, result = 0;
		while(temp >0) {
			int re = temp%10;
			result = (result*10)+re;
			temp/=10;
		}
		if(result == n) {
			return true;
		}
		else
		
		return false;
		
	}
	
}
public class PalindromeSeries {

	public static void main(String[] args) {
		SeriesPalindrome s = new SeriesPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a  = sc.nextInt();
		int count = 0;
		System.out.println("Palindrome for given Series " +a +" is");
		for(int n=0; n<=a; n++) {
			if(s.palindromeSeries(n)) {
				System.out.println(n);				
			}
		}
	}

}
