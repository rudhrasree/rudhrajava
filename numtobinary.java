import java.util.Scanner;
public class numtobinary
{
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int[] arr=new int[10];
	    int temp=n;
	    int i=0;
	    while(temp>0)
	    {
	        arr[i]=temp%2;
	        temp=temp/2;
	        i++;
	    }
	    for(int j=i-1;j>=0;j--)
	    {
	        System.out.print(arr[j]);
	    }
	}
}