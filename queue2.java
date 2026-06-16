import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class queue2
{
	public static void main(String[] args) 
	{
	    Queue<String> q = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		for(int i=0; i<a1; i++)
		{
		    String a= scan.nextLine();
		    if (a.equals("ENTER")) 
		    {
                String name = scan.nextLine();
                q.add(name);
		    }
		    else if(a.equals("SERVE"))
		    {
		        String name1 = scan.nextLine();
		        q.remove();
		    }
		}
		System.out.print(q);
	}
}
