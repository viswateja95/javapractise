//Write a program to print the conversion table to change the temperature in centigrade(C) to temperature in Fahrenheit (F) 
//for all temperatures between 28C to 50C.Use the formula F= (9/5) C+32.
package Basic50prgs;

import java.util.Scanner;

public class prg19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the celcius temprature");
//		float c = sc.nextFloat();
		for(float c = 28; c<=50; c++) {
			
			float a = c*9/5;
			
			float f = a+32;
			System.out.println("Farenheit temperature for given cetigrade is :" +f);
			
		}

	}

}
