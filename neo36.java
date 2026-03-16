import java.util.Scanner;
class NumberCounter
{
    void get(int n)
    {
        int count=0;
        int temp=n;
        if(temp == 0)
        {
            count =1;
        }
        while(temp>0)
        {
            temp = temp/10;
            count++;
        }
        System.out.println(count);
    }
}
public class neo36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int n = sc.nextInt();
            NumberCounter aa = new NumberCounter();
            aa.get(n);
        }
        sc.close();
    }
}