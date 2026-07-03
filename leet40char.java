import java.util.Scanner;
class Solution 
{
    public static void reverseString(char[] s) 
    {
         int left = 0;
        int right = s.length - 1;

        while (left < right) 
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char[] b = new char[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.next().charAt(0);
        }
        reverseString(b);
    }
}
