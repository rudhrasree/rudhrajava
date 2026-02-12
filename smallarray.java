import java.util.Scanner;
public class smallarray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=scan.nextInt();
        }
        int min = a[0];
        for (int j = 1; j < a.length; j++) {
            if (a[j] < min) {
                min = a[j];
            }
        }
        System.out.print(min);
}
}
