import java.util.Scanner;
class neo26{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        int c = scan.nextInt();
        boolean bool = false;
        for(int i=0; i<a; i++)
        {
            for(int j=1; i<a; i++)
            {
                if(b[i]+b[j]==c)
                {
                   bool = true;
                }
            }
        }
        if( bool == true)
        {
             System.out.print("Array has two elements with given sum "+c);
        }
        else
        {
             System.out.print("Array doesn't have two elements with given sum "+c);
        }
    }
}
