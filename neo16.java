import java.util.Scanner;
class hello
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0;
        int c = 10;
        for(int i=0; i<a; i++)
        {
            b = b + c;
            c = c * 2;
        }
        System.out.print (b) ;
    }
}