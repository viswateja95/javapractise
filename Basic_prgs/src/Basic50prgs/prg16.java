//Write a program to print the sum of squares of first 5 three divisible numbers from 100.
package Basic50prgs;

public class prg16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int sum = 0;
		for(int i = 100; i>= 100; i++) {
			if(i%3 == 0)
			sum += (i*i);
			count++;
		}
		if(count == 5)
	System.out.println(sum);
	}

}
