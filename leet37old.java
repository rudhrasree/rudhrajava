import java.util.Scanner;

class leet37old
{
    public void moveZeroes(int[] nums) 
    {
        int k = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        
        while (k < nums.length) 
        {
            nums[k] = 0;
            k++;
        }
        
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
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
        leet37old sol = new leet37old();
        sol.moveZeroes(b);
    }
}
