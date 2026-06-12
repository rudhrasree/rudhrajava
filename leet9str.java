import java.util.Scanner;

class leet9str 
{
    public boolean isValid(String s) 
    {
        for(int i = 0; i < s.length() - 1; i++)
        {
            while(s.contains("()") || s.contains("[]") || s.contains("{}"))
            {
                 s = s.replace("()", "");
                 s = s.replace("[]", "");
                 s = s.replace("{}", "");
            }
        }
        return s.length() == 0;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();

        leet9str sol = new leet9str();

        boolean b = sol.isValid(a);

        System.out.print(b);
    }
}