import java.util.Scanner;

public class rect
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int b = scan.nextInt();
        
        for(int i = 1; i <= l; i++)
        {
           for(int j = 1; j <= b; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}