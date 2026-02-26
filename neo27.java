import java.util.Scanner;
class neo27{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        int c = 0;
        int d = 0;
        for(int i=0; i<a; i++)
        {
            for(int j=i+1; j<a; j++)
            {
                if(b[i]==b[j])
                {
                     c = 1;
                     d = b[i];
                     break;
                }
            }
            if(c==1)
            {
                break;
            }
        }
        if(c==1)
        {
            System.out.print("The first repeating element is "+d);
        }
        else
        {
            System.out.print("There are no repeating elements");
        }
    }
}