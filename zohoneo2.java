import java.util.*;

public class zohoneo2
{
    public static int factorial(int n)
    {
        int sum = 0;
        int temp = n;

        while(temp > 0)
        {
            int digit = temp % 10;

            int fact = 1;
            for(int i = 1; i <= digit; i++)
            {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        return sum;
    }

    public static int sum(int n)
    {
        int sum = 0;

        while(n > 0)
        {
            sum = sum + (n % 10);
            n = n / 10;
        }

        return sum;
    }

    public static boolean isPrime(int n)
    {
        if(n < 2)
        {
            return false;
        }

        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int f1 = factorial(a);
        int s1 = sum(a);

        if(!(isPrime(f1) && isPrime(s1)))
        {
            a = a * 3;
        }

        int f2 = factorial(b);
        int s2 = sum(b);

        if(!(isPrime(f2) && isPrime(s2)))
        {
            b = b * 3;
        }

        System.out.println(a + b);
    }
}
