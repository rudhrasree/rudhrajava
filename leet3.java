import java.util.Scanner;
class leet3 
{
    public static int removeElement(int[] nums, int val) 
    {
        int k = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

        int value = scan.nextInt();

        int ans = removeElement(arr, value);
        System.out.print(ans);
        for(int i = 0; i < ans; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}