import java.util.Scanner;
class neo15
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a<1 || a>9)
        {
            System.out.print("Invalid Input");
        }
        else
        {
             char b = scan.next().charAt(0);
             if (b == 'r')
             {
                 int c = a + 5;
                 System.out.print(c);
             }
             else
             {
                 System.out.print(a);
             }
        }
    }
}