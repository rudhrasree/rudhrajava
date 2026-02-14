import java.util.Scanner;
public class targetsum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("enter the array numbers: ");
        for(int i=0;i<5;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print("Enter target no: ");
        int b = scan.nextInt();
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]+a[j]==b)
                {
                    System.out.print(a[i]+"+"+a[j]+"="+b);
                }
            }
        }
    }
}
