import java.util.*;
class Solution 
{
    public static void rotate(int[] nums, int k) 
    {
        int n = nums.length;
       
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < n; i++)
        {
          nums[i] = arr[i];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(nums[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        int c = scan.nextInt();
        rotate(b,c);
    }
}
