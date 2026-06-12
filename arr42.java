import java.util.Scanner;
public class arr42
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int[] b = new int[a];
	    for(int i=0; i<a; i++)
	    {
	        b[i] = sc.nextInt();
	    }
	    int c = sc.nextInt();
	    int k = 0;
	    for(int i=0; i<a; i++)
	    {
	        if(c == b[i])
	        {
	            k++;
	        }
	    }
	    System.out.println(k);
	}
}
