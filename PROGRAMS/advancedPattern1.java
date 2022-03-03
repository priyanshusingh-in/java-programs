/*

Video explanation of the core concept:
https://www.youtube.com/watch?v=PQig5KVzxJQ

-------------------------------------------------

Sample input:
4

Sample output:
12344321
123**321
12****21
1******1

*/
        
        import java.util.Scanner;
        
        class advancedPattern1
        {
        	public static void main (String[] args) throws java.lang.Exception
        	{
        		Scanner sc = new Scanner(System.in);
        		int n = sc.nextInt();
        		int i = 1;
        		while(i<=n){
        		    int j = 1;
        		    while(j<=2*n){
        		        if(j<=n+1-i||j>=n+i){
        		         if(j<=n){
        		            System.out.print(j);
        		        }
        		            else
        		            System.out.print((n*2+1)-j);
        		        }
        		        else
        		            System.out.print("*");
        		        j++;
        		    }
        		    System.out.println();
        		    i++;
        		}
        	}
        }
