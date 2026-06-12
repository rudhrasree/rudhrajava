import java.util.Scanner;
public class removestr53
{
    public static String repeat(String a, String b)
    {
        String s1 = "";
        for(int i=0; i<a.length(); i++)
        {
            char c1 = a.charAt(i);
            boolean found = false;
            for(int j=0; j<b.length(); j++)
            {
                char c2 = b.charAt(j);
                if(c1 == c2)
                {
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                s1 = s1 + c1;
            }
        }

        return s1;
    }
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = repeat(a,b);
		System.out.print(c);
	}
}