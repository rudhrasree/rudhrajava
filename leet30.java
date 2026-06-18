import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Solution 
{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> boo = new ArrayList<>();
        int max = 0;
        for(int i=0; i<candies.length; i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++)
        {
            if((candies[i] + extraCandies) >= max)
            {
                boo.add(true);
            }
            else
            {
                boo.add(false);
            }
        }
        return boo;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        int c = scan.nextInt();
        List<Boolean> ans = kidsWithCandies(b,c);
        System.out.print(ans);
    }
}
