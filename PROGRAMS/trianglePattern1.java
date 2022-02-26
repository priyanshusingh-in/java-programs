/*

Sample input:
4

Sample output:
1
12
123
1234

*/

import java.util.Scanner;

class triangelPattern1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n){
		    int j = 1;
		    while(j<=i){
		        System.out.print(j);
		        j++;
		    }
		    System.out.println();
		    i++;
		}
	}
}
