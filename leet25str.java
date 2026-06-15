import java.util.Scanner;
class Solution 
{
    public static int lengthOfLastWord(String s) 
    {
        String[] word = s.split(" ");
        int lastindex = word.length - 1; 
        String lastword = word[lastindex]; 
        int ans = lastword.length();
        return ans; 
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int a = lengthOfLastWord(s);
        System.out.print(a);
    }
}
