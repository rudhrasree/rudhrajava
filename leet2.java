import java.util.Scanner;
class leet2 {
    public static int removeDuplicates(int[] nums) 
    {
        int k = 1;
        if(nums.length == 0)
        {
            return 0;
        }
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i - 1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args)
    {
        System.out.print("");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }
        int ans = removeDuplicates(arr);
        System.out.print(ans);
        for(int i = 0; i < ans; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}