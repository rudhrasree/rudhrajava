import java.util.Scanner;
class hello{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        
        int[][] matrix1 = new int[size1][size2];
        int[][] matrix2 = new int[size1][size2];
        int[][] matrix3 = new int[size1][size2];
        
        for(int i=0; i<size1; i++)
        {
            for(int j=0; j<size2; j++)
            {
                matrix1[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<size1; i++)
        {
            for(int j=0; j<size2; j++)
            {
                matrix2[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<size1; i++)
        {
            for(int j=0; j<size2; j++)
            {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j] ;
            }
        }
        for(int i=0; i<size1; i++)
        {
            for(int j=0; j<size2; j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}