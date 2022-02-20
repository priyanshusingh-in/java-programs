// Program to print "HELLO!" n times. n is taken as input from user.


import java.util.Scanner;

public class printHelloUser {
   public static void main(String argsp[]) {
                        
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int i = 1;
     
     while(i <= n) {
     
       System.out.println("HELLO!");
       i += 1;
     }
     
     
   }
}
