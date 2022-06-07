//Write a program to print the sum of all 6 divisible numbers between 1 and 50.
package Basic50prgs;

public class prg15 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i<=50; i++) {
			if(i%6 == 0 ) {
				count +=i;
//				System.out.println(count+ " sum of all 6 divisible number between 1 to 50");
			}
//			System.out.println(count+ " sum of all 6 divisible number between 1 to 50");
		}
		System.out.println(count);

	}
	
//	static int sumDivisibles(int A, int B, int M)
//	{
//		// Variable to store the sum
//		int sum = 0;
//
//		// Running a loop from A to B and check
//		// if a number is divisible by i.
//		for (int i = A; i <= B; i++)
//
//			// If the number is divisible,
//			// then add it to sum
//			if (i % M == 0)
//				sum += i;
//
//		// Return the sum
//		return sum;
//	}
//
//	// Driver code
//	public static void main(String[] args)
//	{
//		// A and B define the range
//		// M is the dividend
//		int A = 1, B = 50, M = 3;
//
//		// Printing the result
//		System.out.print(sumDivisibles(A, B, M) +"\n");
//	}

}
