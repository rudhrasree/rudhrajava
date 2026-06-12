import java.util.Scanner;
public class aaabubblenew1
{
    public static void bubble(int[] b,int a)
    {
        for(int i=0; i<a-1; i++)
        {
            for(int j=0; j<a-1-i; j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp = b[j];
                    b[j]= b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
	public static void main(String[] args) 
	{
		System.out.println("Bubble Sorting");
		Scanner scan= new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
		{
		    arr[i] = scan.nextInt();
		}
		bubble(arr,size);
		for(int i=0; i<size; i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
