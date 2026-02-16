import java.util.Scanner;
class neo20
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=1; i<=b; i++)
        {
            int c = i*a;
            System.out.println(i+"*"+a+"="+c);
        }
    }
}