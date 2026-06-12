import java.util.Scanner;
public class firstrepeatchar52
{
    public static String repeat(String s)
    {
        for(int i=0; i<s.length(); i++)
        {
            char c1 = s.charAt(i);
            for(int j=i+1; j<s.length(); j++)
            {
                char c2 = s.charAt(j);
                if(c1 == c2)
                {
                    return String.valueOf(c1);
                }
            }
        }
        return "No repeating character";
    }
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = repeat(a);
		System.out.print(b);
	}
}
