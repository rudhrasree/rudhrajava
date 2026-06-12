import java.util.HashMap;
import java.util.Scanner;
public class hashmap2
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) 
		{
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
		System.out.print("Frequency "+map);
	}
}
