import java.util.Scanner;
class ne028{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        
        int[][] matrix = new int[size1][size2];
       
        for(int i=0; i<size1; i++)
        {
            for(int j=0; j<size2; j++)
            {
                 matrix[i][j] = scan.nextInt();
            }
        }
        int sum1 = 0;
        for(int i=0; i<size1; i++)
        {
            sum1 = sum1 + matrix[i][i];
        }
        System.out.print(sum1);
    }
}
