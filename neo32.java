import java.util.Scanner;
class neo32
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = "";
        for(int i=a.length()-1; i>=0; i--)
        {
            b= b+a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not a palindrome");
        }
    }
}