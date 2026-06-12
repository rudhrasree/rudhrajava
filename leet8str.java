import java.util.Scanner;
class leet8str {
    public String longestCommonPrefix(String[] strs) 
    {
       String ans = "";
       String first = strs[0];
       for(int i=0; i<first.length(); i++)
       {
          char ch = first.charAt(i);
          for(int j=1; j<strs.length; j++)
          {
              if(i>= strs[j].length() || strs[j].charAt(i) != ch)
              {
                return ans;
              }
          }
          ans = ans + ch;
       }
       return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[] b = new String[a];
        for(int i=0; i<a; i++)
        {
            b[i] = scan.nextLine();
        }
        leet8str sol= new leet8str();
        String ans = sol.longestCommonPrefix(b);
        System.out.print(ans);
    }
}