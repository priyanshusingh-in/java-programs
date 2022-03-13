/*

Sample input
4

Sample output

   *
  ***
 *****
*******
 *****
  ***
   *

*/

import java.util.*;

class advancedPattern12
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner sc = new Scanner(System.in);
     int N=sc.nextInt();
     
     int n1 = N;
     int n2 = N-1;
     int vartoprint=1;
     
     for(int i=1; i<=n1; i++){
         for(int j=1; j<=n1-i; j++){
             System.out.print(" ");
         }
         for(int k=1; k<=(2*i)-1; k++){
             System.out.print("*");
         }
         System.out.println();
     }
     
     for(int i=n2; i>=1; i--){
        for(int j=1; j<=(n2-i)+1; j++){
             System.out.print(" ");
         }
         for(int k=1; k<=(2*i)-1; k++){
             System.out.print("*");
         }
         
      System.out.println();   
     }
	}
}
