import java.util.Scanner;
import java.util.HashSet;
class Main
{
    public static int can(int[] b) 
    {
        HashSet<Integer> s1 = new HashSet<>();
        int ans = -1;
        for(int i=0; i<b.length; i++)
        {
            if(s1.contains(b[i]))
            {
                ans = b[i];
                break;
            }
            else{
                s1.add(b[i]);
            }
        }
        return ans;
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
        int ans = can(b);
        System.out.print(ans);
    }
}
