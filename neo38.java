import java.util.Scanner;
class DayOfWeek
{
    void displayDay()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 1)
        {
            System.out.print("Sunday");
        }
        if(n == 2)
        {
            System.out.print("Monday");
        }
        if(n == 3)
        {
            System.out.print("Tuesday");
        }
        if(n == 4)
        {
            System.out.print("Wednesday");
        }
        if(n == 5)
        {
            System.out.print("Thursday");
        }
        if(n == 6)
        {
            System.out.print("Friday");
        }
        if(n == 7)
        {
            System.out.print("Saturday");
        }
        if(n == 8)
        {
            System.out.print("Invalid Day");
        }
    }
}
class neo38
{
    public static void main(String[] args)
    {
        DayOfWeek ruba = new DayOfWeek();
        ruba.displayDay();
    }
}