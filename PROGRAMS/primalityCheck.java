// Program to check if a number(n) is prime or not prime. n taken as input as student.

import java.util.*;

class primalityCheck
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int div = 2;
	  
	  while(div <= n/2)
	  {
	      if(n%div == 0)
	      {
		System.out.println("Composite");
		return;
	      }
	      div += 1;
	  }
	 System.out.println("Prime");
	}
}
