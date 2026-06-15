import java.util.Scanner;
class Solution 
{
    public static int climbStairs(int n) 
    {
        if (n <= 2) {
            return n;
        }
        
        int first = 1;  
        int second = 2; 
        
        
        for (int i = 3; i <= n; i++) {
            int current = first + second; 
            first = second;               
            second = current;           
        }
        
        return second;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ans = climbStairs(a);
        System.out.print(ans);
    }
}
