import java.util.*;
class Solution 
{
    public static int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            s.add(nums[i]);
        }
        int maxi =0;
        for(int i : s)
        {
            if(!s.contains(i - 1))
            {
                int curr = i;
                int count = 1;

                while(s.contains(curr + 1))
                {
                    curr++;
                    count++;
                }
                maxi = Math.max(maxi,count);
            }
        }
        return maxi;
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
        int ans = longestConsecutive(b);
        System.out.print(ans);
    }
}
