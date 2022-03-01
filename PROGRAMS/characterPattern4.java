/*

Sample input:
4

Sample output:

A
BC
CDE
DEFG

*/

import java.util.Scanner;
public class characterPattern4 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	    int i = 1;
        while(i<=n){
            char ithchar = (char)('A'+i-1);
            int j = 1;
            while(j<=i){
                System.out.print(ithchar);
                ithchar = (char)(ithchar++);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
