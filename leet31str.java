import java.util.Scanner;
class leet34str 
{
    public static String toLowerCase(String s) 
    {
        String s1 = s.toLowerCase();
        return s1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = toLowerCase(a);
        System.out.print(b);
    }
}
