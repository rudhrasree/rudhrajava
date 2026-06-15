import java.util.Scanner;
class Solution 
{
    public static boolean isPalindrome(int x) 
    {
        int num = x;
        int rev =0;
        while(x>0)
        {
            int rem = x%10;
            rev = rev *10+rem;
            x = x/10;
        }
        if(num == rev)
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
        int a = scan.nextInt();
        boolean boo = isPalindrome(a);
        System.out.print(boo);
    }
}
