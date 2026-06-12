import java.util.Arrays;
import java.util.Scanner;
class leet13arr
{
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i + 1])
            {
                return true;
            }
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
        leet13arr s = new leet13arr();
        boolean boo = s.containsDuplicate(b);
        System.out.print(boo);
    }
}