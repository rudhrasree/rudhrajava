import java.util.Scanner;
class square38
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      for(int i=1; i<=a; i++)
      {
          for(int j=1; j<=a; j++)
          {
              if(i == 1 || i == a || j == 1 || j == a)
              {
                  System.out.print("* ");
              }
              else{
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
  }
}