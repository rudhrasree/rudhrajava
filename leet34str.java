import java.util.Scanner;
class leet34str
{
    public static boolean isPalindrome(String s) 
    {
        String aa = "";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) 
            {
                aa = aa + ch;
            }
        }
        String n = aa.replace(" ","");
        String n1 = n.toLowerCase();
        String n2 = "";
        for(int i=n1.length()-1; i>=0; i--)
        {
            char c = n1.charAt(i);
            n2 = n2 + c;
        }
        if(n1.equals(n2))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        boolean b = isPalindrome(a);
        System.out.print(b);
    }
}
