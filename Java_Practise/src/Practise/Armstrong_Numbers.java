package Practise;

import java.util.Scanner;

public class Armstrong_Numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:\n");
		int n = sc.nextInt();
		int a =0, temp = n;
		for(int i = 0; i<=n; i++) {
			int re = n%10;
			a += Math.pow(re, 3);
			n/=10;
			System.out.println(i);
			
		}
		if(a == temp) {
			System.out.println(a);
		}
		
	}

}
