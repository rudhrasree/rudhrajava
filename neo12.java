import java.util.Scanner;
class neo12
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=85 && a<=100)
        {
            System.out.print("A");
        }
        else if(a>=75 && a<=84)
        {
            System.out.print("B");
        }
        else if(a>=65 && a<=74)
        {
            System.out.print("C");
        }
        else if(a>=0 && a<=64)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}