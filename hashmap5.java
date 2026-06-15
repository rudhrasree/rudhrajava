import java.util.Scanner;
import java.util.HashMap;
class Solution 
{
    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++)
        {
            char ch = magazine.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(int i=0; i<ransomNote.length(); i++)
        {
            char ch1 = ransomNote.charAt(i);
            if(!map.containsKey(ch1) || map.get(ch1)==0)
            {
                return false;
            }
            map.put(ch1, map.get(ch1) - 1);
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        boolean ans = canConstruct(a,b);
        System.out.print(ans);
    }
}
