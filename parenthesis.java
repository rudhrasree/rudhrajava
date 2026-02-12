import java.util.Scanner;
public class parenthesis
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String a= scan.nextLine();
int count=0;
for(int i=0;i<a.length();i++)
{
   char b= a.charAt(i);
   if(b=='(')
   {
       count++;
   }
   else if(b==')')
   {
       count--;
   }
}
if(count==0)
{
    System.out.print("0");
}
else{
  System.out.print("1");
}
}
}

