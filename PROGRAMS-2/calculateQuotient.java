/*

Sample Input:
20
0

Sample Output:
denominator cannot be '0'!

Sample Input 2:
34
3

Sample Output 2:
Quotient of 34 and 3 = 11

*/


import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void Quotient(int num1, int num2)
    { 
        if(num2==0)
        {
        System.out.println("denominator cannot be '0'!");
        return;
        }

        int Quotient=num1/num2;
        System.out.print("Quotient of "+num1+" and "+num2+" = "+Quotient);
        
    }
 public static void main (String[] args) 
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int p=sc.nextInt();
     Quotient(n,p);
     
 }

}
