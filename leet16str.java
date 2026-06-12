import java.util.Scanner;

class leet16str 
{
    public static int firstUniqChar(String s) 
    {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(freq[s.charAt(i) - 'a'] == 1)
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

        int result = firstUniqChar(s);

        System.out.println(result);
    }
}