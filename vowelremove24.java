import java.util.Scanner;
public class vowelremove24
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    String a = scan.nextLine();
	 
	    for(int i=0;i<a.length();i++)
	    {
	        char b= a.charAt(i);
	        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
	        {
	           
	        }
	        else{
	            System.out.print(b);
	        }
	    }
	}
}
