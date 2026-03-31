import java.util.Scanner;
public class pattern47
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = 1;
for(int i=a; i>=1; i--)
{
   for(int j=1; j<=i; j++)
   {
      System.out.print(b+" ");
      b++;
   }
   System.out.println();
}
}
}