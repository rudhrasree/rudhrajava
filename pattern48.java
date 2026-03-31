import java.util.Scanner;
public class pattern48
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
char b = 'A';
for(int i=1; i<=a; i++)
{
   for(int j=1; j<=i; j++)
   {
      System.out.print(b+" ");
   }
   b++;
   System.out.println();
}
}
}