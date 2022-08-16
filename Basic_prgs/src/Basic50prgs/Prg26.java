//Write a program to print all palindrome numbers between 100 and 200.
package Basic50prgs;

import java.util.Scanner;

class Palindrome{
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
}
public class Prg26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		for (int i = 100; i <=n; i++) {
			if(Palindrome.palindrome(i)) {
				System.out.println(i);
			}
		}
		
	}

}
