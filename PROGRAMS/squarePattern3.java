/*

Sample input:

4

Sample output:

1234
1234
1234
1234

*/

import java.util.Scanner;
class squarePattern3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
		    int j = 1;
		    while(j<=n){
		        System.out.print(j);
		        j++;
		    }
		    System.out.println();
		    i++;
		}
	}
}
