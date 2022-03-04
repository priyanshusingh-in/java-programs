/*

Sample input:
4

Sample output:

ABCD
ABC
AB
A

*/
  
        import java.util.*;
        
        class advancedPattern2
        {
        	public static void main (String[] args) throws java.lang.Exception
        	{
        		Scanner sc = new Scanner(System.in);
        		int n = sc.nextInt();
        		int i = 1;
        		while(i<=n){
        		    int j = 1;
        		    while(j<=n-i+1){
        		        char jthchar = (char)('A'+j-1);
        		          System.out.print(jthchar);
        		        j++;
        		    }
        		    System.out.println();
        		    i++;
        		}
        	}
        }
