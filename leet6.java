import java.util.Scanner;
import java.util.Arrays;

class leet6
{
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        for(int i = 0; i < n; i++)
        {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        for(int i = 0; i < nums1.length; i++)
        {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int size1 = scan.nextInt();

        int[] nums1 = new int[size1];

        for(int i = 0; i < size1; i++)
        {
            nums1[i] = scan.nextInt();
        }

        int m = scan.nextInt();

        int size2 = scan.nextInt();

        int[] nums2 = new int[size2];

        for(int i = 0; i < size2; i++)
        {
            nums2[i] = scan.nextInt();
        }

        int n = scan.nextInt();

        merge(nums1, m, nums2, n);
    }
}