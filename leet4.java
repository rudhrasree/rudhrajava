import java.util.Scanner;
class leet4 
{
    public static int searchInsert(int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] >= target)
            {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = scan.nextInt();
        }
        int insert = scan.nextInt();
        int ans = searchInsert(arr, insert);
        System.out.print(ans);
    }
}