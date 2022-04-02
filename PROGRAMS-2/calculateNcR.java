/*

Java code to calculate NcR.

Sample input:
6
4

Sample output:
15

*/

/* package codechef; // don't place package name! */

//METHOD 1

import java.util.*;
class calculateNcR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int factN=1;
		for(int i=1;i<=n;i++)
		{
		  factN*=i;
		}
		int factR=1;
		for(int i=1;i<=r;i++)
		{
		    factR*=i;
		}
		int factNR=1;
		for(int i=1;i<=n-r;i++)
		{
		 factNR*=i;
		}
		int result=factN/(factR*factNR);
		System.out.println(result);
	}
}


//METHOD 2

import java.util.*;
class calculateNcR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int factN=1, factR=1, factNR=1;
		for(int i=2;i<=n;i++)
		{
		 factN*=i;
			if(i<=r)
				factR*=i;
			if(i<=n-r)
				factNR*=i;
		}
		
		int result=factN/(factR*factNR);
		System.out.println(result);
	}
}


//METHOD 3(Using Function)

import java.util.*;

class calculateNcR
{
    public static int factorial(int num)
    { 
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
 public static void main (String[] args) 
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int r=sc.nextInt();
     int factN=factorial(n);
     int factR=factorial(r);
     int factNR=factorial(n-r);
     int result=factN/(factR*factNR);
     System.out.println(result);
 }

}
