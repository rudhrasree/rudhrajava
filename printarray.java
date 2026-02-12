import java.util.Scanner;
public class printarray {
    public static void main(String[] args) {
        int[] b = new int[10];
        Scanner scan= new Scanner(System.in);
        System.out.print("enter a:");
        int a = scan.nextInt();
        for(int i=0; i<a; i++)
        {
            b[i]= scan.nextInt();
        }
        for(int i=0; i<a; i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("Enter no to be deleted:");
        int c= scan.nextInt();
        int[] index= new int[10];
        for(int i=c; i<a; i++)
        {
            index[i] = b[i];
            System.out.print(index[i]+" ");
        }
        System.out.println();
        for (int i=0;i<c;i++)
        {
            index[i] = b[i];
            System.out.print(index[i]+" ");
        }
    }
}
