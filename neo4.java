import java.util.Scanner;
class neo4{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = (a+b+c+d);
        double a1 = (a/e)*100;
        double a2 = (b/e)*100;
        double a3 = (c/e)*100;
        double a4 = (d/e)*100;
        System.out.format("Total expenses: Rs. %.2f\n",e);
        System.out.format("Branding expenses percentage: %.2f%%\n",a1);
        System.out.format("Travel expenses percentage: %.2f%%\n",a2);
        System.out.format("Food expenses percentage: %.2f%%\n",a3);
        System.out.format("Logistics expenses percentage: %.2f%%\n",a4);
    }
}