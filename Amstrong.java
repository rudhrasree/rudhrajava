class Main {
    public static void main(String[] args) {
       int num=370,total=0,number,temp;
       number=num;
       while(number!=0)
       {
           temp=number%10;
           total=total+temp*temp*temp;
           number/=10;
       }
       if(total==num)
       {
           System.out.print("amstrong");
       }
       else
       {
           System.out.print("Not amstrong");
       }
    }
}
