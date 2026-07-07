import java.util.*;
class Solution 
{
    public static int maxNumberOfBalloons(String text) 
    {
        if (!text.contains("b") || !text.contains("a") || !text.contains("l") || !text.contains("o") || !text.contains("n")) 
        {
            return 0;
        }

         int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;

        for(int i = 0; i < text.length(); i++)
        {
            char ch1 = text.charAt(i);
            if (ch1 == 'b') bCount++;
            else if (ch1 == 'a') aCount++;
            else if (ch1 == 'l') lCount++;
            else if (ch1 == 'o') oCount++;
            else if (ch1 == 'n') nCount++;
        }
        lCount = lCount / 2;
        oCount = oCount / 2;
        int ans = bCount;
        if (aCount < ans) ans = aCount;
        if (lCount < ans) ans = lCount;
        if (oCount < ans) ans = oCount;
        if (nCount < ans) ans = nCount;

        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String a = scan.nextLine();
        int b = maxNumberOfBalloons(a);
        System.out.print(b);
    }
}
