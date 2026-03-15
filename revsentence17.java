import java.util.Scanner;
public class revsentence17
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String a= scan.nextLine();
        String[] b = a.split(" ");
        for (int i = b.length- 1; i >= 0; i--) 
        {
            System.out.print(b[i]+" ");
        }
    }
}