import java.util.Scanner;
class neo14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<15)
        {
            System.out.println("Welcome to the show");
            System.out.println("Please note that you should be accompanied by an adult");
        }
        else
        {
            System.out.print("Welcome to the show");
        }
    }
}