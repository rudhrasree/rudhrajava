import java.util.Scanner;
class LoanCalculator
{
    void calculateEMI()
    {
        Scanner scan = new Scanner(System.in);
        double p = scan.nextDouble();
        double r = scan.nextDouble();
        int n = scan.nextInt();
        
        double a1 = r/12/100;
        int n1 = n*12;
        double a2 = Math.pow(1+a1,n1);
        double emi = (p*a1*a2)/(a2 - 1);
        System.out.printf("EMI: %.2f",emi);
    }
}
class neo37
{
    public static void main(String[] args)
    {
        LoanCalculator a = new LoanCalculator();
        a.calculateEMI();
    }
}