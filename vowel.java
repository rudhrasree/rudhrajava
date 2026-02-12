import java.util.Scanner;
public class vowel{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String a= scan.nextLine();
        for(int i=0;i<a.length()-1;i++)
        {
            char b= a.charAt(i);
            char c= a.charAt(i+1);
            if((b=='a'&& c=='a')||(b=='e'&&c=='e')||(b=='i'&&c=='i')||(b=='o'&&c=='o')||(b=='u'&&c=='u'))
            {
                System.out.print(b);
                System.out.print(c);
            }
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
            {
                
            }
            else{
                System.out.print(b);
            }
        }
    }
}