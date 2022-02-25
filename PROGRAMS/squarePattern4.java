/*

Sample input:

4

Sample output:

4321
4321
4321
4321

*/

import java.util.Scanner;
class squarePattern4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
		    int j = n;
		    while(j>=1){
		        System.out.print(j);
		        j--;
		    }
		    System.out.println();
		    i++;
		}
	}
}
