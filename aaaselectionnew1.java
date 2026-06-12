import java.util.Scanner;
public class aaaselectionnew1
{
    public static void bubble(int[] b,int a)
    {
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
    }
	public static void main(String[] args) 
	{
		System.out.println("Selection Sorting");
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
