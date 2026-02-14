import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int a= scan.nextInt();
      int b=0;
      for(int i=1;i<a;i++)
      {
         if(a%i==0)
         {
            b=b+i;
         }
      }
      if(a==b)
      {
         System.out.print(a+" is prefect number");
      }
      else
      {
         System.out.print(a+"is not a perfect number");
      }
   }
}
