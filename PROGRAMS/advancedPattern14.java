/*

Sample input 
3

Sample output

    *
  * *
* * *

*/



import java.util.*;

class advancedPattern14
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner sc = new Scanner(System.in);
     int N=sc.nextInt();
     
     for(int i=1; i<=N; i++){
         for(int j=1; j<=N;j++){
             if(j<=N-i)
             System.out.print(" ");
             else
             System.out.print("*");
         }
         System.out.println();
     }
	}
}
