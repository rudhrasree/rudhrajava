import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
class Solution 
{
    public int firstUniqChar(String s) 
    {
        int[] count = new int[26];
        Queue<Character> ch = new LinkedList<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch1 = s.charAt(i);
            ch.add(ch1);
            count[ch1 - 'a']++;
        }
        for(int i=0; i<s.length(); i++)
        {
            char curr = ch.poll();
            if(count[curr-'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        Solution sol = new Solution();

        int result = sol.firstUniqChar(s);

        System.out.println(result);
    }
}
