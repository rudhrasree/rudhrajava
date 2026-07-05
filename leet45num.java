import java.util.Scanner;
class Solution 
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;

        int[] merge = new int[m + n];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else {
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            merge[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            merge[k] = nums2[j];
            j++;
            k++;
        }

        int len = merge.length;

        if (len % 2 == 0) {
            return (merge[len / 2] + merge[len / 2 - 1]) / 2.0;
        } else {
            return merge[len / 2];
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[a];
        int[] d = new int[b];
        for(int i=0; i<a; i++)
        {
            c[i] = scan.nextInt();
        }
        for(int i=0; i<b; i++)
        {
            d[i] = scan.nextInt();
        }
        double ans = findMedianSortedArrays(c,d);
        System.out.print(ans);
    }
}
