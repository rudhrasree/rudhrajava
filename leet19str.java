import java.util.Scanner;
import java.util.Arrays;
class leet19str
{
    public static char findTheDifference(String s, String t) 
    {
         char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != b[i])
            {
                return b[i];
            }
        }

        return b[b.length - 1];
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        char ch = findTheDifference(s,t);
        System.out.print(ch);
    }
}