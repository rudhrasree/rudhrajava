import java.util.Scanner;
public class ascendingstring
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
String a= scan.nextLine();
String[] b=a.split(" ");
String[] d= new String[b.length];
for(int i=0;i<b.length;i++)
{
    int index= -1;
    String nul="";
   for(int j=0;j<b[i].length();j++)
   {
       char c= b[i].charAt(j);
       if((c>='0')&&(c<='9'))
       {
           index= c-'0';
       }
       else
       {
           nul = nul+c;
       }
   }
   d[index] = nul;
}
for (int i = 0; i < d.length; i++)
{
            System.out.print(d[i]+" ");
        }
}
}


