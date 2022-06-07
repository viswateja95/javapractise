//Write a program to print alternate 7 divisible numbers between 50 and 100
package Basic50prgs;

public class prg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i+=2) {
			if(i%7 == 0) {
				System.out.println(i+ " divisible by 7");
			}
		}

	}

}
