/*

Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7

*/

import java.util.Scanner;
public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int decimal=0, pow=1;
        while(N>0)
        {
            int last=N%10;
            decimal+=last*pow;
            pow*=2;
            N/=10;
        }
        System.out.print(decimal);

    }
}
