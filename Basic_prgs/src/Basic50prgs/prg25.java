//print given number is armstrong number
package Basic50prgs;

import java.util.Scanner;

public class prg25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value\n");
		int n = sc.nextInt();
		int s = 0;
		int temp = n;
		while(n!=0) {
			int r = n%10;
			s +=Math.pow(r, 3);
			n/=10;
//			System.out.println(s);
			
		}
		if(s == temp) {
			System.out.println(s+ " It is a armstrong number");
		}else
			System.out.println(s+ "it is not an armstrong number");
	}

}
