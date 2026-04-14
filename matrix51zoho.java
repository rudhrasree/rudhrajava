import java.util.Scanner;

public class matrix51zoho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[][] b = new int[a][a];

      
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        
        int[][] c = new int[a][a];
        
        for (int i = 0; i < a; i++) 
        {
            c[i][0] = b[0][i];
        }
        for (int i = 0; i < a; i++) 
        {
            c[i][2] = b[2][i];
        }
        int k = 0;
        for (int i = a - 1 ; i >= 0 ; i--) 
        {
            c[i][1] = b[1][k];
            k++;
        }
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}