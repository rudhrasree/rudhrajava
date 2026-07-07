import java.util.*;
class leet48hash 
{
    public static List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> anss = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);
            }
            if(map.get(nums[i]) == 2)
            {
                anss.add(nums[i]);
            }
        }
        return anss;
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
        List<Integer> ans = findDuplicates(b);
        System.out.print(ans);
    }
}
