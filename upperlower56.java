import java.util.Scanner;
public class upperlower56
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = "";
		for(int i=0; i<a.length(); i++)
		{
		    char ch = a. charAt(i);
		    if(Character.isUpperCase(ch))
		    {
		        b = b + Character.toLowerCase(ch);
		    }
		    else if(Character.isLowerCase(ch))
		    {
		        b = b + Character.toUpperCase(ch);
		    }
		}
		System.out.print(b);
	}
}
