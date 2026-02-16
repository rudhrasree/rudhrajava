import java.util.Scanner;
class neo19
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int org = a;
        int sum = 0;
        while(a>0)
        {
            int digit = a%10;
            int fact = 1;
            for(int i=1;i<=digit;i++)
            {
                fact = fact*i;
            }
            sum = sum + fact;
            a = a / 10;
        }
        if(sum == org)
        {
            System.out.print(org +" Strong Number");
        }
        else
        {
            System.out.print(org +" Not Strong Number");
        }
    }
}
