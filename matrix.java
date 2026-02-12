import java.util.Scanner;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[][] a= new int[10][10];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
         for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+a[i][i];
        }
        System.out.println(sum);
    }
}
