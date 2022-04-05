import java.util.*;

class checkPrime
{
  public static boolean primalityCheck(int num)
  {
   int div = 2;
	  
	  while(div <= num/2)
	  {
	      if(num%div == 0)
	      {
    		return false;
	      }
	      div += 1;
	  }
    return true;
  }
  
       public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  boolean result=primalityCheck(n);
	  System.out.println(result);
       }
}
