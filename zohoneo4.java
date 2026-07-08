import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                int sum = a[i][j];

                if (i > 0) 
                {
                    sum += a[i - 1][j];   
                }
                if (i < n - 1) 
                {
                    sum += a[i + 1][j]; 
                }
                if (j > 0)
                {
                    sum += a[i][j - 1];     
                }
                if (j < n - 1) 
                {
                    sum += a[i][j + 1]; 
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
