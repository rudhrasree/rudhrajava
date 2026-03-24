import java.util.Scanner;
public class found43
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int[][] b = new int[a][a];
	    
	    for(int i=0; i<a; i++)
	    {
	        for(int j=0; j<a; j++)
	        {
	            b[i][j] = scan.nextInt();
	        }
	    }
	    int s = scan.nextInt();
	    boolean f = false;
	    for(int i=0; i<a; i++)
	    {
	        for(int j=0; j<a; j++)
	        {
	           if ( b[i][j] == s )
	           {
	               f = true;
	               break;
	           }
	        }
	    }
	    if(f == true)
	    {
	        System.out.println(s +" is in the matrix");
	    }
	    else
	    {
	        System.out.println(s +" is not in the matrix");
	    }
	}
}
