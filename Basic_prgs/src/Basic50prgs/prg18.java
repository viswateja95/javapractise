//Write a program to print the numbers from 1 to 100 with five values per line, two blank spaces between values
package Basic50prgs;

public class prg18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 5;
		for (int i=1; i<=100; i++) {
			System.out.println(i + " ");
			
			if((i+1)%count == 0) 
				System.out.println();
		}
		System.out.println();

	}

}
