import java.util.Scanner;
class leet5 {
    public static int[] plusOne(int[] digits) 
    {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newarr = new int[digits.length + 1];

        newarr[0] = 1;

        return newarr;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = scan.nextInt();
        }
        int[] ans= plusOne(arr);
        for(int i=0; i<ans.length; i++)
        {
            System.out.println(ans[i]+",");
        }
    }
}