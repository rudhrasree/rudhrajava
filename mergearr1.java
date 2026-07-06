import java.util.*;
class Main
{
    public static int[] mergeTwoLists(int[] list1, int[] list2) 
    {
        int m = list1.length;
        int n = list2.length;

        int[] arr = new int[m+n];

        int i =0;
        int j =0;
        int k =0;

        while(i<m && j<n)
        {
            if(list1[i] <= list2[j])
            {
                arr[k] = list1[i];
                i++;
            }
            else
            {
                arr[k] = list2[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            arr[k] = list1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            arr[k] = list2[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[a];
        for(int i=0; i<a; i++)
        {
            c[i] = scan.nextInt();
        }
        int[] d = new int[b];
        for(int i=0; i<b; i++)
        {
            d[i] = scan.nextInt();
        }
        int[] ans = mergeTwoLists(c,d);
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]);
        }
    }
}
