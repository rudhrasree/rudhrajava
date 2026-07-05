import java.util.*;
public class twopointer1
{
    public static String rev(String s)
    {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left<right)
        {
            if(!Character.isLetter(ch[left]))
            {
                left++;
            }
            if(!Character.isLetter(ch[right]))
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
        String s1 = new String(ch);
        return s1;
    }
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String ans = rev(a);
		System.out.print(ans);
	}
}
