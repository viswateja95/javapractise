//Write a program to print the sum of alternate 7 divisible numbers between 1 and 50.
package Basic50prgs;

public class prg17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=50; i+=2) {
			if(i%7 == 0) {
				System.out.println(i+ " alternate number divisible by 7");
			}
			
		}
	}

}
