import java.util.Scanner;
import java.util.HashMap;
class Solution 
{
    public static int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                 map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                 map.put(nums[i], 1);
            }

            if(map.get(nums[i]) > nums.length / 2)
            {
                return nums[i];
            }
        }
        return nums[0];
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
        int ans = majorityElement(b);
        System.out.print(ans);
    }
}
