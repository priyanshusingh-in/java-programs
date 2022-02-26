/*

Sample input:
4

Sample output:
1
23
345
4567

*/

import java.util.Scanner;

class trianglePattern3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
		    int p = i;
		    int j = 1;
		    while(j<=i){
		        System.out.print(p);
		        p++;
		        j++;
		    }
		    System.out.println();
		    i++;
		}
	}
}
