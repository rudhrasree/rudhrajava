import java.util.Scanner;
class neo9{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        if(scan.hasNextInt())
        {
        int a = scan.nextInt();
        char b = scan.next().charAt(0);
        if (a<=500)
        {
            int c = a+b;
            System.out.print(c);
        }
        else{
            System.out.print("Invalid");
        }
        }
    }
}
