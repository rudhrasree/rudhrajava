import java.util.Scanner;
import java.util.HashMap;
public class hashing1
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		for(int i=0; i<a; i++)
		{
		    b[i]= scan.nextInt();
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<a; i++)
		{
		    map.put(b[i],map.getOrDefault(b[i],0)+1);
		}
		System.out.print("Frequency "+map);
	}
}
