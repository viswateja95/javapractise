package Practise;

import java.util.Scanner;

class Main
{
    public void alternatePrimeNumbers(int n)
    {
        int i;
        boolean prime,flag=true;
        for(i=n; i>=1; i--)
        {
            prime = checkPrime(i);
            if(prime)
            {
                if(flag)
                {
                    System.out.print(i+" ");
                    flag = false;
                }
                else if(flag==false)
                    flag = true;
            }
        }
    }

    public boolean checkPrime(int n)
    {
        int i;
        boolean prime=true;
        for(i=2; i<=n/2; i++)
        {
            if(n%i==0) //condition for non-prime numbers
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

public class ReversePrimeNumber {
	static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Main obj = new Main();
        System.out.print("Enter the value of n :- ");
        int num = input.nextInt();
        System.out.println("Alternate Prime numbers in reverse order upto "+num+" :- ");
        obj.alternatePrimeNumbers(num);
    }

}
