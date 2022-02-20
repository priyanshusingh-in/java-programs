// Program to print sum of n natural numbers. n taken as input from the user.


import java.util.Scanner;

public class sumNaturalNumber{
    public static void main(String args[]){
      
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int sum = (n*(n+1)/2);
       
       System.out.println(sum);
    }
}
