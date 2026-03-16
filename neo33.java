import java.util.Scanner;
class neo33
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split(" ");
        String small = b[0];
        String big = b[0];
        for(int i=1; i<b.length; i++)
        {
            if(b[i].length()<small.length())
            {
                small = b[i];
            }
            if(b[i].length()>big.length())
            {
                big = b[i];
            }
        }
        System.out.println("Smallest word: "+small);
        System.out.println("Largest word: "+big);
    }
}
