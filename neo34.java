import java.util.Scanner;

class neo
{
    void get()
    {
        Scanner scan = new Scanner(System.in);

        double l = scan.nextDouble();
        double b = scan.nextDouble();

        double a = l * b;
        double p = 2 * (l + b);

        System.out.printf("Area : %.2f%n", a);
        System.out.printf("Perimeter : %.2f%n", p);
    }
}

class neo34
{
    public static void main(String[] args)
    {
        neo r = new neo();
        r.get();
    }
}