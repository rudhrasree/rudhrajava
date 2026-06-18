import java.util.Scanner;
import java.util.HashSet;
class Solution 
{
    public static int missingNumber(int[] nums) 
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            s.add(nums[i]);
        }
        for(int i=0; i<=nums.length; i++)
        {
            if(!s.contains(i))
            {
                return i;
            }
        }
        return -1;
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
        int ans = missingNumber(b);
        System.out.print(ans);
    }
}
