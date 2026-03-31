import java.util.Scanner;

public class matrix50zoho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[][] b = new int[a][a];

      
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        
        for (int i = 0; i < a; i++) 
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < a; j++) 
                {
                    System.out.print(b[i][j] + " ");
                }
            } 
            else
            {
               for (int j = a - 1; j >= 0; j--) 
               {
                  System.out.print(b[i][j] + " ");
               }
            }
            System.out.println(); 
        }

        scan.close();
    }
}