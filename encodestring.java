import java.util.Scanner;
public class encodestring
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String a = scan.nextLine();
	int num=0;
	for(int i=0;i<a.length();i++)
	{
	    char b = a.charAt(i);
	    if(Character.isLetter(b))
	    {
	        num=0;
	       for(int j=i+1; j<a.length();j++) 
	       {
	           char d = a.charAt(j);
	           if(Character.isDigit(d))
	           {
	               num = num * 10 + (d - '0');
                   i = j;
	           }
	           else{
	               break;
	           }
	       }
	       for(int k=0;k<num;k++)
    	   {
	         System.out.print(b);
           }
	    }
	}
  }
}
