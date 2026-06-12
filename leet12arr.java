import java.util.Scanner;
class leet12arr
{
    public int maxProfit(int[] prices) 
    {
       int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxProfit)
            {
                maxProfit = profit;
            }
        }

        return maxProfit;
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
        leet12arr sol = new leet12arr();
        int ans = sol.maxProfit(b);
        System.out.print(ans);
    }
}