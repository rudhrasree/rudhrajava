import java.util.Scanner;
class leet11matrix
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int rows = mat.length;
        int cols = mat[0].length;

        if(rows * cols != r * c)
        {
            return mat;
        }

        int[][] newmat = new int[r][c];

        int row = 0;
        int col = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                newmat[row][col] = mat[i][j];

                col++;

                if(col == c)
                {
                    col = 0;
                    row++;
                }
            }
        }
        return newmat;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] mat = new int[a][b];
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                mat[i][j]= scan.nextInt();
            }
        }
        int r = scan.nextInt();
        int c = scan.nextInt();
        leet11matrix sol = new leet11matrix();
        int[][] ans = sol.matrixReshape(mat,r,c);
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                 System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}