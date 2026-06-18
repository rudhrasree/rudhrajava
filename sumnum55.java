import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        while(num > 9)
        {
            int sum =0;
            while (num > 0) 
            {
                  int digit = num % 10; 
                  sum = sum + digit;         
                  num /= 10;           
            }
             num = sum;
        }
        System.out.print(num);
	}
}
