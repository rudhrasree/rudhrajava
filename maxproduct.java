import java.util.Scanner;
public class maxproduct
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("enter the array numbers: ");
        for(int i=0;i<5;i++)
        {
            a[i]=scan.nextInt();
        }
        int max = a[0];
        for(int i=0;i<5;i++)
        {
            int prod = 1;
            for(int j=i;j<5;j++)
            {
                prod = prod*a[j];
                if(prod > max)
                {
                    max = prod;
                }
            }
        }
        System.out.print(max);
    }
}