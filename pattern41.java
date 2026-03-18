import java.util.Scanner;
class pattern41
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 5;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<r-i; j++)
            {
                int a = ((i+j)*(i+j+1)/2)+(j+1);
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}