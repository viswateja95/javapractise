//Write a program to print the decimal equivalent for the given binary number
package Basic50prgs;
class Binary{
	static void binary(int decimal) {
		
		int b[] = new int[40];
		int k=0;
		while (decimal>0) {
			b[k++]= decimal%2;
			decimal/=2;
			
		}
		for(int i = k-1;i >= 0;i--){    
		       System.out.print(b[i]);    
		     }    
	}
}

public class Prg33 {

	public static void main(String[] args) {
		Binary b = new Binary();
		System.out.println("Decimal of 10 is: ");  
		b.binary(10);    
	}

}
