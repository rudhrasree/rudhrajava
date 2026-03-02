import java.util.Scanner;
class neo31
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = a.replaceAll("\\s+", "");
        System.out.print(b);
    }
}