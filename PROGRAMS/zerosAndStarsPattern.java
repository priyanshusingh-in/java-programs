/*

Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
*00*00*
0*0*0*0
00***00
Sample Input 2 :
5
Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000

*/

import java.util.Scanner;
public class zerosAndStarsPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int start=1, mid=N+1, end=(2*N)+1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=(2*N)+1;j++)
            {
                if(j==start||j==mid||j==end)
                {
                    System.out.print("*");
                }
                else
                    System.out.print("0");
            }
            start++;
            end--;
            System.out.println();
        }
	}	
}
