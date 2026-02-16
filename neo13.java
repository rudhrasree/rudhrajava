import java.util.Scanner;
class neo13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a%10;
        if(b==3 || b==8)
        {
            System.out.print("Lucky Winner");
        }
        else
        {
            System.out.print("Not a Lucky Winner");
        }
    }
}