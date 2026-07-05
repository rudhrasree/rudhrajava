import java.util.Scanner;
class Solution 
{
    public static int search(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == target) 
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
        int c = scan.nextInt();
        int ans = search(b,c);
        System.out.print(ans);
    }
}
