import java.util.*;
class leet47pointer 
{
    public static boolean isVowel(char c1)
    {
        char c = Character.toLowerCase(c1);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static String reverseVowels(String s) 
    {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left<right)
        {
            if(!isVowel(ch[left]))
            {
                left++;
            }
            else if (!isVowel(ch[right]))
            {
                right--;
            }
            else
            {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }
        String z = new String(ch);
        return z;
    }
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String ans = reverseVowels(a);
        System.out.print(ans);
    }
}
