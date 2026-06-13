import java.util.HashMap;
import java.util.Scanner;
class hashmap4 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
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
        hashmap4 s = new hashmap4();
        boolean boo = s.containsDuplicate(b);
        System.out.print(boo);
    }
}
