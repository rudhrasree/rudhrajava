class decifraction
{
    public static void main(String[] args) 
    {
       double a= 2.95;
       int b= (int) a;
       double c=(a-b);
       int deno=100;
       int num=(int)Math.round(c*deno);
       int gcd = gcd(num,deno);
       num = num/gcd;
       deno = deno/gcd;
       
       System.out.println(b + " " + num + "/" + deno);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}