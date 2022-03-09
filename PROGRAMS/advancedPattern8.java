/*

Sample input:
4

Sample output:

4444
333
22
1

*/


import java.util.*;

class advancedPattern8
{
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n-i+1; j++)
            {
                System.out.print(n-i+1);
            }

            System.out.println();
        }
    }
}
