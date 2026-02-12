import java.util.Scanner;
public class longarray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=scan.nextInt();
        }
        int max = a[0];
        for (int j = 1; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        System.out.print(max);
}
}
