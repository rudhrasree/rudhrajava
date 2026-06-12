import java.util.Scanner;
public class aaainsertionnew1
{
    public static void bubble(int[] b,int a)
    {
        for(int i=1; i<a; i++)
        {
            int key = b[i];
            int j = i - 1;
            while(j>=0 && b[j]>key)
            {
                b[j+1] = b[j];
                j--;
            }
            b[j+1] = key;
        }
    }
	public static void main(String[] args) 
	{
		System.out.println("Insertion Sorting");
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
