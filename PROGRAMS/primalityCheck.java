// Program to check if a number(n) is prime or not prime. n taken as input as student.

import java.util.*;

class primalityCheck
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;
		boolean isPrime = true;
		
		while(div <= n-1)
    {
		    
		    if(n%div == 0)
        {
		    isPrime = false;
		     }
		     div = div+1;
		}
	if(isPrime)
	 System.out.println("Prime");
	else
	 System.out.println("Not prime");
	}
}
