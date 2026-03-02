import java.util.Scanner;
public class dsa1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        int count =0;
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextInt();
        }
        for(int i=0; i< a - 1; i++)
        {
            for(int j=0; j<a-i-1; j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1]=temp;
                    count++;
                }
            }
        }
        for(int i=0; i<a; i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("no of swapped count is "+count);
    }
}
