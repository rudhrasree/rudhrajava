import java.util.Scanner;
class neo25
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        int max = b[0];
        int min = b[0];
        for(int i=1; i<a; i++)
        {
            if(b[i]>max)
            {
                max = b[i];
            }
            else if(b[i]<min)
            {
                min = b[i];
            }
        }
        int c = max - min;
        System.out.print("The maximum absolute difference is: "+c);
    }
}