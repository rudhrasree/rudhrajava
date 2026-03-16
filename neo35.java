import java.util.Scanner;
class Doc
{
    void get()
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        int c = scan.nextInt();
        System.out.println("Name : "+a);
        System.out.println("Address : "+b);
        System.out.println("Ward Number : "+c);
    }
}
class neo35
{
    public static void main(String[] args)
    {
        Doc a = new Doc();
        a.get();
    }
}