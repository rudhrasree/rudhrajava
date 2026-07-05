import java.util.*;
class Solution 
{
    public static String reverseOnlyLetters(String s) 
    {
        char[] ch = s.toCharArray();
        int left =0;
        int right = ch.length - 1;

        while(left<right)
        {
            if(!Character.isLetter(ch[left]))
            {
                left++;
            }
            else if(!Character.isLetter(ch[right]))
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
        String a1 = new String(ch);
        return a1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String ans = reverseOnlyLetters(a);
        System.out.print(ans);
    }
}
