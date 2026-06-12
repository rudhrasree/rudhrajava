import java.util.Scanner;
class leet17str 
{
    public static boolean checkIfPangram(String sentence) 
    {
        for(char ch = 'a'; ch <= 'z'; ch++) 
        {
            if(sentence.indexOf(ch) == -1) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        boolean b = checkIfPangram(a);
        System.out.print(b);
    }
}