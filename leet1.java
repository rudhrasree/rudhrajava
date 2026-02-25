import java.util.*;
class leet1 {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] index = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=1; i<=4; i++)
        {
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int[] temp= new leet1().twoSum(nums,target);
        System.out.println(Arrays.toString(temp));
    }
}