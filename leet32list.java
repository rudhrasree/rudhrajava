import java.util.Scanner;
class Solution 
{
    public static int[] createTargetArray(int[] nums, int[] index) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) 
        {
            list.add(index[i], nums[i]);
        }
        
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            target[i] = list.get(i);
        }
        
        return target;
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
        int[] ans = createTargetArray(b,d);
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]);
        }
    }
}
