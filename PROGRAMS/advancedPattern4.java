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
     Scanner sc = new Scanner(System.in);
     int N=sc.nextInt();
     for(int i = 1; i<=N;i++){
        int vartoprint = (N-i)+1;
         for(int j=1; j<=i; j++){
             System.out.print(vartoprint);
             vartoprint++;
         }
         vartoprint = 5;
         for(int k=1; k<=N-i; k++){
             System.out.print(vartoprint);
         }
         System.out.println();
     }
	}
}
