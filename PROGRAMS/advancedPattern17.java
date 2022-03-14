/*

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        System.out.println("*");
        
        //first half
        for( i=1; i<=n; i++){
            System.out.print("*");
            for( j=1; j<=i; j++){
                System.out.print(j);
            }
            
            for( k=j-2; k>=1; k--){
                System.out.print(k);
            }
            System.out.println("*");
        }
        
        //second half
        for( i=1; i<=n-1; i++){
            System.out.print("*");
            for( j=1; j<=n-i; j++){
                System.out.print(j);
            }
            for( k=j-2; k>=1; k--){
                System.out.print(k);
            }
            System.out.println("*");
        }
        System.out.print("*");
        
    }
}
