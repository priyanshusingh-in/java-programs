/*

Sample input:
4

Sample output:

   *
  **
 ***
****

*/


import java.util.*;

class advancedPattern5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j < n-i+1; j++)
            {
                System.out.print(" ");
            }

            for (int k = n-i; k < n; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
 	}
}
