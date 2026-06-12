import java.util.Scanner;
public class matrix
{
    public int mat(int[][] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i][i];
        }
        return sum;
    }
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner (System.in);
	    int a = scan.nextInt();
	    int[][] b = new int[a][a];
	    for(int i=0; i<a; i++)
	    {
	        for(int j=0; j<a; j++)
	        {
	            b[i][j] = scan.nextInt();
	        }
	    }
	    matrix m = new matrix();
	    int ans= m.mat(b);
	    System.out.print(ans);
	}
}
