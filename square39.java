import java.util.Scanner;
class square39
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num =1;
        for(int i=1; i<=n; i++)
        {
            if(i%2==1)
            {
                for(int j=1; j<=n; j++)
                {
                   System.out.print(num+" ");
                   num++;
                }
            }
            else
            {
                int a = num+n-1;
                for(int j=1; j<=n; j++)
                {
                    System.out.print(a+" ");
                    a--;
                }
                num += n;
            }
            System.out.println();
        }
    }
}
