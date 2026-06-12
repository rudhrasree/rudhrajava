import java.util.Scanner;
class leet7str
{
    public int romanToInt(String s) 
    {
        String u = s.toUpperCase();
        int sum = 0;
        int[] d = new int[u.length()];
        for(int i=0; i<u.length(); i++)
        {
            char l = u.charAt(i);
            if(l == 'I')
            {
                d[i] = 1;
            }
            if(l == 'V')
            {
                d[i] = 5;
            }
            if(l == 'X')
            {
                d[i] = 10;
            }
            if(l == 'L')
            {
                d[i] = 50;
            }
            if(l == 'C')
            {
                d[i] = 100;
            }
            if(l == 'D')
            {
                d[i] = 500;
            }
            if(l == 'M')
            {
                d[i] = 1000;
            }
        }
        for(int i=0; i<d.length; i++)
        {
            if(i < d.length - 1 && d[i] < d[i + 1])
            {
                 sum = sum - d[i];
            }
            else
            {
                sum = sum + d[i];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        leet7str sol = new leet7str();
        int ans = sol.romanToInt(a);
        System.out.print(ans);
    }
}