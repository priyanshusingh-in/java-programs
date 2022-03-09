/*

Sample input:
4

Sample output:

   1
  121
 12321
1234321

*/


import java.util.*;

class advancedPattern9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
	}
}
