import java.util.Scanner;
public class repeatedwords
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner (System.in);
	System.out.print("enter the word to be searched:");
	String a = scan.nextLine();
	String b = scan.nextLine();
	String c = scan.nextLine();
	String[] b1 = b.split(" ");
	String[] c1 = c.split(" ");
	int count1=0;
	int count2=0;
	for(int i=0;i<b1.length;i++)
	{
	    if(a.equals(b1[i]))
	    {
	        count1++;
	    }
	}
	for(int i=0;i<c1.length;i++)
	{
	    if(a.equals(c1[i]))
	    {
	        count2++;
	    }
	}
	if(count1<count2)
	{
	    System.out.println(b);
	    System.out.println(c);
	}
	else
	{
	    System.out.println(c);
	    System.out.println(b);
	}
	}
}
