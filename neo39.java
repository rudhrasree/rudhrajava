import java.util.Scanner;
class neo39
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        int count =0;
        for(int i=0; i<a; i++)
        {
            b[i]=scan.nextInt();
        }
        for(int i=0; i<a; i++)
        {
            for(int j=i+1; j<a; j++)
            {
                if(b[i]>b[j])
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}