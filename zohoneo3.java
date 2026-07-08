import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] words = text.split(" ");
        String longest = "";
        for(int i=0; i<words.length; i++)
        {
            if(words[i].length() > longest.length())
            {
                longest = words[i];
            }
        }
        System.out.print(longest);
    }
}
