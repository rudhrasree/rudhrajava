import java.util.*;
class Solution 
{
    public static String reverseStr(String s, int k) 
    {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i += 2 * k) {

            int left = i;
            int right = Math.min(i + k - 1, ch.length - 1);

            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }

        return new String(ch);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b = scan.nextInt();
        String ans = reverseStr(a,b);
        System.out.print(ans);
    }
}
