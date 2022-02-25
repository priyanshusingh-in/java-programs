/*

Sample input:

4

Sample output:

1111
2222
3333
4444

*/

import java.util.Scanner;
class squarePattern2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
		    int j = 1;
		    while(j<=n){
		        System.out.print(i);
		        j++;
		    }
		    System.out.println();
		    i++;
		}
	}
}
