import java.util.HashMap;
import java.util.Scanner;
class hashmap3 
{
    public static int[] twoSum(int[] b, int c)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < b.length; i++)
        {
            int diff = c - b[i];

            if(map.containsKey(diff))
            {
                int a1 = map.get(diff);
                int a2 = i;
    
                result[0] = a1;
                result[1] = a2;

                return result;
            }
            map.put(b[i], i);
        }
        return result;
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

        int target = scan.nextInt();

        int[] ans = twoSum(arr, target);

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
