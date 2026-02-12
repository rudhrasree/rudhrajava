class Main {
    public static void main(String[] args) {
       int num=131,rev=0,original,rem;
       original=num;
       while(original!=0)
       {
           rem=original%10;
           rev=rev*10+rem;
           original/=10;
       }
       if(rev==num)
       {
           System.out.print("palindrome");
       }
       else
       {
           System.out.print("Not Palindrome");
       }
    }
}