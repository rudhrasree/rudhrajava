class reverseno {
    public static void main(String[] args) {
       int num=132,rev=0,original,rem;
       original=num;
       while(original!=0)
       {
           rem=original%10;
           rev=rev*10+rem;
           original/=10;
       }
           System.out.print(rev);
    }
}