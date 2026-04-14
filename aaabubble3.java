import java.util.Scanner;
public class aaabubble3
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
        int k = 0;
	    for(int i=0; i<a-1; i++)
	    {
	        for(int j=0; j<a-1-i; j++)
	        {
	            if(b[j]>b[j + 1])
	            {
                    k++;
	                int temp = b[j + 1];
	                b[j + 1] = b[j];
	                b[j] = temp;
	            }
	        }
	    }
	    for(int i=0; i<a; i++)
	    {
	        System.out.print(b[i]+" ");
	    }
         System.out.println("Swap count is "+k);
	}
}
