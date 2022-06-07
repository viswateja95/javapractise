package Basic50prgs;

import java.util.Scanner;

//Write a program to convert the given centigrade temperature to foreign heat
public class prg5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celcius temprature");
		float c = sc.nextFloat();
		
		float a = c*5/9;
		
		float f = a+32;
		
		System.out.println("Farenheit temperature for given cetigrade is :" +f);
		

	}

}
