/*

Sample input:

4

Sample output:

1
11
202
3003
*/

import java.util.*;
public class advancedPattern3
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int firstFib =1;
		int secondFib = 1;
		for(int i=1;i<=n;i++){
		    
		    if(i==1){
		        System.out.print(firstFib);
		    }else if(i==2){
		        System.out.print(secondFib+""+secondFib);
		    }else{
		        int currentFibValue = firstFib+secondFib;
		        firstFib = secondFib;
		        secondFib =currentFibValue;
		        System.out.print(currentFibValue);
		        for(int j=2;j<=i-1;j++){
		            System.out.print(0);
		        }
		        System.out.print(currentFibValue);
		        
		    }
		  System.out.println();
		}
	}
}

