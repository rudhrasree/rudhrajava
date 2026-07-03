import java.util.Scanner;
import java.util.HashMap;
class Solution 
{
    public static boolean wordPattern(String pattern, String s) 
    {
        String[] a1 = s.split(" ");
        if (pattern.length() != a1.length) 
        {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) 
        {
            char ch = pattern.charAt(i);
            String word = a1[i];
            if (charToWord.containsKey(ch)) 
            {
                if (!charToWord.get(ch).equals(word)) 
                {
                    return false; 
                }
            } 
            else 
            {
                charToWord.put(ch, word);
            }
            if (wordToChar.containsKey(word)) 
            {
                if (wordToChar.get(word) != ch) 
                {
                    return false; 
                }
            } 
            else 
            {
                wordToChar.put(word, ch);
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        boolean boo = wordPattern(a,b);
        System.out.print(boo);
    }
}
