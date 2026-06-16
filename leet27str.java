import java.util.Scanner;
class leet27str
{
    public static int strStr(String haystack, String needle) 
    {
        if(needle.length() > haystack.length())
        {
            return -1;
        }
    
        for(int i=0; i<=haystack.length() - needle.length(); i++)
        {
            char[] ch = new char[needle.length()];
            for(int j=0; j<needle.length(); j++)
            {
                char ch1 = haystack.charAt(i+j);
                char ch2 = needle.charAt(j);
                if(ch1 == ch2)
                {
                    ch[j] = ch2;
                }
            }
             String result = new String(ch);
             if(result.equals(needle))
             {
                  return i;
             }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        int ans = strStr(a,b);
        System.out.print(ans);
    }
}
