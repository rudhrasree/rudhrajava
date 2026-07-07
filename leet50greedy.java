import java.util.*;
class Solution 
{
    public static int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; 
        int j = 0; 
        int happy = 0;

        while (i < g.length && j < s.length) 
        {
            if (s[j] >= g[i]) 
            {
                happy++;
                i++;
                j++;
            } 
            else 
            {
                j++;
            }
        }
        return happy;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
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
        int ans = findContentChildren(b,d);
        System.out.print(ans);
    }
}
