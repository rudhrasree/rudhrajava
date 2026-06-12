import java.util.Scanner;
class leet18str 
{
    public static int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;
        for(int i=0; i<jewels.length(); i++)
        {
            char c1 = jewels.charAt(i);
            for(int j=0; j<stones.length(); j++)
            {
                char c2 = stones.charAt(j);
                if(c1==c2)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String jewels = scan.nextLine();
        String stones = scan.nextLine();
        int ans = numJewelsInStones(jewels, stones);
        System.out.print(ans);
    }
}