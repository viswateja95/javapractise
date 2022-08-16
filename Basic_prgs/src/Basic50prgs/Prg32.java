//convert binary to decimal
package Basic50prgs;
class Decimal{
	public static int getDecimal(int binary)
	{  
	    int decimal = 0, n = 0;  
	    while(true)
	    {  
	      if(binary == 0)
	      {  
	        break;  
	      } else 
	      {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          n++;  
	       }  
	    }  
	    return decimal;  

	}
}

public class Prg32 {
	public static void main(String args[])
	{
		Decimal dc = new Decimal();
		System.out.println("Decimal of 1010 is: "+dc.getDecimal(1010));  
		System.out.println("Decimal of 10101 is: "+dc.getDecimal(10101));  
		System.out.println("Decimal of 11111 is: "+dc.getDecimal(11111));  
	}
}


