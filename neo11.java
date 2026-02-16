import java.util.Scanner;
class neo11
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=15)
        {
            System.out.print("Adult Ticket");
        }
        else
        {
            System.out.print("Child Ticket");
        }
    }
}