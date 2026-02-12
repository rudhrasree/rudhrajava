import java.util.Scanner;
public class robbery
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int[] a= new int[5];
        for(int i=0;i<=4;i++)
        {
            a[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<=4;i++)
        {
            if(i%2==0)
            {
                sum=sum+a[i];
            }
            else{
                
            }
        }
        System.out.print(sum);
    }
}
