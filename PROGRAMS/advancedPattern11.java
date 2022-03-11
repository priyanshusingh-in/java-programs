/*

Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654

*/


import java.util.*;

class advancedPattern11
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
            int vartoprint = i;
            for (int k = 1; k<=i; k++)
            {
                System.out.print(vartoprint);
                vartoprint++;
            }
             vartoprint = (2*i)-2;
            for(int l=1; l<=i-1; l++)
            {
                System.out.print(vartoprint);
                vartoprint--;
            }
            System.out.println();
        }
	}
}
