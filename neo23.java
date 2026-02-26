import java.util.Scanner;
class neo23{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        for(int i=0; i<a; i++)
        {
            if(b[i]%2==0)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
        System.out.println("Number of even numbers : "+count1);
        System.out.println("Number of odd numbers : "+count2);
    }
}