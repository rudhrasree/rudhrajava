import java.util.Scanner;
class Solution 
{
    public static int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] n = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int sum =0;
            for(int j= 0; j<nums.length; j++)
            {
                int count = 1;
                if(nums[i] > nums[j])
                {
                    sum = sum + count;
                    count++;
                }
            }
            n[i] = sum;
        }
        return n;
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
        int[] c = smallerNumbersThanCurrent(b);
        for(int i=0; i<c.length; i++)
        {
            System.out.print(c[i]);
        }
    }
}
