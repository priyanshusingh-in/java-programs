/*

Sample input:
4

Sample output:

ABCD
BCDE
CDEF
DEFG

*/

import java.util.Scanner;

class characterPattern3
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 1;
	while(i<=n){
	    char ithchar = (char)('A'+i-1);
	    int j = 1;
	    while(j<=n){
	        System.out.print(ithchar);
	        ithchar = (char)(ithchar+1);
	        j++;
	    }
	    System.out.println();
	    i++;
      }
	}
}
