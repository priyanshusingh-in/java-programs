/*

Sample input
4

Sample output

   1
  121
 12321
1234321
 12321
  121
   1

*/



import java.util.*;

class advancedPattern15
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
         vartoprint = 1;
         for(int k=1; k<=i; k++){
             System.out.print(vartoprint);
             vartoprint++;
         }
         vartoprint = i-1;
         for(int l=1; l<=i-1; l++){
             System.out.print(vartoprint);
             vartoprint--;
         }
         System.out.println();
     }
     
     for(int i=n2; i>=1; i--){
        for(int j=1; j<=(n2-i)+1; j++){
             System.out.print(" ");
         }
         vartoprint = 1;
         for(int k=1; k<=i; k++){
             System.out.print(vartoprint);
             vartoprint++;
         }
         vartoprint = i-1;
         for(int l=1; l<=i-1; l++){
             System.out.print(vartoprint);
             vartoprint--;
         } 
      System.out.println();   
     }
	}
}
