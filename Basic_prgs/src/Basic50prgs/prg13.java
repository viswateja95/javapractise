//Write a program to print first 5 alternate 7 divisible numbers after 100
package Basic50prgs;

public class prg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for (int i=1; i<=200; i+=2) {
			if (i%7 == 0 && count <= 5) {
				System.out.println(i+ " divisible by 7");
				count++;
			}
			
		}

	}

}
