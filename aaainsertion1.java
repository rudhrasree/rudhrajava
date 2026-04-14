import java.util.Scanner;
public class aaainsertion1
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		for(int i=0; i<a; i++)
		{
		    b[i] = scan.nextInt();
		}
		for(int i=1; i<a; i++)
		{
		    int key = b[i];
		    int j = i - 1;
		    while(j>=0 && b[j]>key)
		    {
		        b[j + 1] = b[j];
		        j--;
		    }
		    b[j + 1] = key;
		}
		for(int i=0; i<a; i++)
		{
		    System.out.print(b[i] +" ");
		}
	}
}