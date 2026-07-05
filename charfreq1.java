import java.util.*;
public class charfreq1
{
    public static String strchange(String s, int n)
    {
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            else if(ch >= '0' && ch <= '9')
            {
                ch = (char)((ch - '0' + n) % 10 + '0');
            }
            s1.append(ch);
        }
        return s1.toString().toLowerCase();
    }
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int b = scan.nextInt();
		String ans = strchange(a,b);
		System.out.print(ans);
	}
}
