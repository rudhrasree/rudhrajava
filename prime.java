import java.util.Scanner;
public class prime
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner (System.in);
	    int[] a = new int[5];
	    for(int i=0;i<5;i++)
	    {
	        a[i] = scan.nextInt();
	    }
	
	    for(int i=0;i<5;i++)
	    {
	        boolean isprime= true;
	        if (a[i] <= 1) 
	        {
            isprime = false;
	            
	        } 
	        else 
	        {
              for (int j = 2; j <= Math.sqrt(a[i]); j++) 
              {
                 if (a[i] % j == 0) 
                 {
                    isprime = false;
                    break;
                 }
              }
	        }
	        if(isprime)
	        {
	            System.out.print(a[i]+" ");
	        }
	        else
	        {
	
	        }
	    }
	}
}
