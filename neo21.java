import java.util.Scanner;
class neo21{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        {
            b[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0; i<a; i++)
        {
           sum = sum+b[i];
        }
        int c = (sum/a);
        for(int i=0; i<a; i++)
        {
            if(b[i] <= c)
            {
                System.out.print(b[i]+" ");
            }
        }
    }
}