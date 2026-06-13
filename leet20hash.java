import java.util.HashMap;
import java.util.Scanner;
class hashmap5 
{
    public static int[] intersection(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums1.length; i++)
        {
            map.put(nums1[i],1);
        }
        for(int i=0; i<nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) == 1)
            {
                count++;
                map.put(nums2[i], 2);
            }
        }
        int[] e = new int[count];
        int k = 0;

        for(Integer key : map.keySet())
        {
            if(map.get(key) == 2)
            {
                e[k] = key;
                k++;
            }
        }

        return e;
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
        int[] d = new int[c];
        for(int i=0; i<c; i++)
        {
            d[i] = scan.nextInt();
        }
        int[] ans = intersection(b,d);
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]);
        }
    }
}
