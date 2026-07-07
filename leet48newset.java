import java.util.*;
class Solution 
{
    public static List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                ans.add(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return ans;
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
        List<Integer> anss = findDuplicates(b);
        System.out.print(anss);
    }
}
