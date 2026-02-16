import java.util.Scanner;
class neo17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = 0;
        while(n!=0)
        {
            int a = n % 10;
            rev = rev * 10 + a;
            n /= 10;
        }
        System.out.print(rev);
    }
}
