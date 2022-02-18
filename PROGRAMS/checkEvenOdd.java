// Program to check if an integer taken as user input is even or odd.

import java.util.Scanner;
public class checkEvenOdd {
   public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check if odd/even");
		int a = sc.nextInt();
		
		if((a%2) == 0)
		System.out.println(a+" is even");
		else
		System.out.println(a+" is odd");
	}
}
