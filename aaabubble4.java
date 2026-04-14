import java.util.Scanner;
public class aaabubble4
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int[] b = new int[a];
	    for(int i=0; i<a; i++)
	    {
	        b[i] = scan.nextInt();
	    }
	    boolean sorted = true;
	    for(int i=0; i<a-1; i++)
	    {
	        for(int j=0; j<a-1-i; j++)
	        {
	            if(b[j]>b[j+ 1])
	            {
	                int temp = b[j+ 1];
	                b[j + 1] = b[j];
	                b[j] = temp;
	                sorted = false;
	            }
	        }
	    }
	    if(sorted == true)
	    {
	        System.out.println("Already Sorted");
	    }
	    else
	    {
	        System.out.println("Not Sorted");
	    }
	}
}
