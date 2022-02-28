/*

Sample input:
4

Sample output:
ABCD
ABCD
ABCD
ABCD

*/

import java.util.Scanner;
public class characterPattern1 {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int i=1;
     while(i<=n){
         
         int j=1;
         while(j<=n){
             char jthchar=(char)('A'+j-1);
             System.out.print(jthchar);
             
             j=j+1;
         }
         System.out.println();
         i=i+1;
     }
    }
}
