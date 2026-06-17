import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0; i<a; i++)
        {
            for(int k=0; k<a - i - 1; k++)
            {
                System.out.print("  ");
            }
            int v=1;
            for(int j=0; j<= i; j++)
            {
                System.out.print(v+"   ");
                v = v*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
