import java.util.Scanner;
public class aaaselection2
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		for(int i=0; i<a; i++)
		{
		    b[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		for(int i=0; i<a-1; i++)
		{
		    int mini = i;
		    for(int j=i+1; j<a; j++)
		    {
		        if(b[j]<b[mini])
		        {
		            mini = j;
		        }
		    }
		    int temp = b[mini];
		    b[mini] = b[i];
		    b[i] = temp;
		}
		for(int i=0; i<a; i++)
		{
		    System.out.print(b[i] +" ");
		}
		System.out.println();
		if(k<=a && k>=0)
		{
		    System.out.println(k+" th smallest element is "+b[k-1]);
		}
	}
}
