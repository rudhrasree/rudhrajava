import java.util.*;
public class zohoneo1
{
    public static int matrix(int[][] mat, int n)
    {
        int ans = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1; j++) 
            {
                int count = 0;
                count += mat[i][j];
                count += mat[i][j + 1];
                count += mat[i + 1][j];
                count += mat[i + 1][j + 1];
                if (count == 3) 
                {
                    ans++;
                    
                }
            }
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int[][] c = new int[b][b];
		for(int i=0; i<b; i++)
		{
		    for(int j=0; j<b; j++)
		    {
		        c[i][j] = scan.nextInt();
		    }
		}
		int anss = matrix(c,b);
		System.out.print(anss);
	}
}
