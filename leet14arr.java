import java.util.Scanner;

class leet14arr 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;

        int[] arr = new int[n];

        arr[0] = 1;

        for(int i = 1; i < n; i++)
        {
            arr[i] = arr[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for(int i = n - 1; i >= 0; i--)
        {
            arr[i] = arr[i] * suffix;

            suffix = suffix * nums[i];
        }

        return arr;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int[] b = new int[a];

        for(int i = 0; i < a; i++)
        {
            b[i] = scan.nextInt();
        }

        leet14arr sol = new leet14arr();

        int[] ans = sol.productExceptSelf(b);

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}