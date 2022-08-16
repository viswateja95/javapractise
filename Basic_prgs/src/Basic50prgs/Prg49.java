
//Write a program to find out the given number for Fibonacci number using recursion logic
package Basic50prgs;

public class Prg49 {

	public static void main(String[] args) {
		System.out.println(fibonacci(10));

	}
	public static int fibonacci(int number) {
		if(number<0) {
			return -1;
		}
		if(number==0||number==1) {
			return number;
		}
		return fibonacci(number-1)+fibonacci(number-2);
	}

}
