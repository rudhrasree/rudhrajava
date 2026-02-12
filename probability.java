import java.lang.Math;
public class probability 
{
    public static void main(String[] args) 
    {
        int n=4;
        int r=3;
        int fact1=1;
        for(int i=1;i<=n;i++)
        {
            fact1= fact1*i;
        }
        int fact2=1;
        for(int i=1;i<=r;i++)
        {
            fact2=fact2*i;
        }
        int a=n-r;
        int fact3=1;
        for(int i=1;i<=a;i++)
        {
            fact3=fact3*i;
        }
        int b=(fact1)/(fact2*fact3);
        double c=(b/Math.pow(2,n));
        System.err.println(c);
    }
}
