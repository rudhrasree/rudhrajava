import java.util.Arrays;
import java.util.Scanner;
public class leet15str
{
    public static boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        boolean boo = isAnagram(s,t);
        System.out.print(boo);
    }
}
