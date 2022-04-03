/*

Sample Input:
6
20

Sample Output:
sum of 6 and 20 = 26
even numbers between 6 and 20 are 
6
8
10
12
14
16
18
20

*/

import java.util.*;

class sumAndEven
{
    public static int sum(int num1, int num2)
    { 
        int sum=num1+num2;
        return sum;
    }
    
    public static void printEven(int startRange, int endRange)
    {
     if(startRange%2!=0)
     startRange++;
     for(int i=startRange; i<=endRange; i+=2)
     {
         System.out.println(i);
     }
    }
    
 public static void main (String[] args) 
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int p=sc.nextInt();
     int result1=sum(n,p);
     System.out.println("sum of "+n+" and "+p+" = "+result1);
     
     System.out.println("even numbers between "+n+" and "+p+" are ");
     printEven(n,p);
 }

}
