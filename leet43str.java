import java.util.Scanner;
class Solution 
{
    public static String reverseStr(String s, int k) 
    {
        String ch = "";
        for(int i=k - 1; i>=0; i--)
        {
            ch = ch + s.charAt(i);
        }
        for(int i=k; i<s.length(); i++)
        {
            ch = ch + s.charAt(i);
        }
        return ch;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b = scan.nextInt();
        String ans = reverseStr(a,b);
        System.out.print(ans);
    }
}
