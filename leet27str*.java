import java.util.Scanner;
class Solution 
{
    public static int strStr(String haystack, String needle) 
    {
       return haystack.indexOf(needle);
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
