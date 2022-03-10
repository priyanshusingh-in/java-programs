/*

Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******

*/


import java.util.*;


class advancedPattern10
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(' ');
            }
            for (int k = 1; k <= (2*i)-1; k++)
            {
                System.out.print("*");
            }  
            
            System.out.println();
        }
	}
}
