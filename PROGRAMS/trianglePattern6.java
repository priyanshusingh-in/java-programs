/*

Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321

*/

import java.util.Scanner;
public class trianglePattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while(i<=N){
            int j = i;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
	}
}
