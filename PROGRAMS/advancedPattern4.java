/*

Sample input:
4

Sample output:
4555
3455
2345
1234

*/


import java.util.*;

class advancedPattern4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1dd; i <= n ; i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.print(j);
            }

            for (int k = n - i; k < n; k++)
            {
                System.out.print(5);
            }
            System.out.println();
        }
	}
}
