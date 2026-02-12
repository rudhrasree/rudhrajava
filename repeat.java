import java.util.Scanner;
public class repeat
{
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String a = scan.nextLine();
	 int maxLength = 0;
        for (int i = 0; i < a.length(); i++) {
            int currentLength = 0;

            for (int j = i; j < a.length(); j++) {
                boolean duplicate = false;

                for (int k = i; k < j; k++) {
                    if (a.charAt(k) == a.charAt(j)) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate)
                {
                    break;
                }
                currentLength++;
            }

            if (currentLength > maxLength)
                maxLength = currentLength;
        }
	System.out.print("Max length is "+maxLength);
	}
}