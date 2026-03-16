import java.util.Scanner;
class neo31
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split(" ");
        for(int i=0; i<b.length; i++)
        {
            System.out.print(b[i]);
        }
    }
}
