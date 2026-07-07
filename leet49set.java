import java.util.*;
class Solution 
{
    public static int maxNumberOfBalloons(String text) 
    {
        if (!text.contains("b") || !text.contains("a") || !text.contains("l") || !text.contains("o") || !text.contains("n")) 
        {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        String b = "balloon";
        for(int i=0; i<b.length(); i++)
        {
            char ch = b.charAt(i);
            set.add(ch);
        }
        int count = 0;
        for(int i=0; i<text.length(); i++)
        {
            char ch1 = text.charAt(i);
            if(set.contains(ch1))
            {
                count++;
            }
        }
        int ans = count / 7;
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
