//Write a program to print the sum of every fourth integer, beginning with 5 for all values less than 100.

package Basic50prgs;

public class prg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; 
		for(int i =5; i < 100; i+=4) {
			
			count += i;
			System.out.println(i+ " sum of the fourth integer");
			
			
		}
	}

}
