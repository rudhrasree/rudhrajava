import java.util.Scanner;
import java.util.HashMap;
class Solution 
{
    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] arr = new int[26];
        for(char c : ransomNote.toCharArray())
        {
            arr[c-'a']++;
        }
        for(char c : magazine.toCharArray())
        {
            arr[c-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
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
        String b = scan.nextLine();
        boolean ans = canConstruct(a,b);
        System.out.print(ans);
    }
}
