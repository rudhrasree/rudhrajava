import java.util.Scanner;
class hello
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c = 1;
        for(int i=1; i<a; i++)
        {
            a = a / 10;
            c++;
        }
        System.out.print(c);
    }
}