import java.util.Scanner;

public class leet10matrix
{
    public static int[][] transpose(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] ans = new int[cols][rows];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        int[][] ans = transpose(matrix);

        for(int i = 0; i < ans.length; i++)
        {
            for(int j = 0; j < ans[0].length; j++)
            {
                System.out.print(ans[i][j] + " ");
            }

            System.out.println();
        }

        scan.close();
    }
}