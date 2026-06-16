import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
class RecentCounter 
{
    private Queue<Integer> q;
    public RecentCounter() 
    {
        q = new LinkedList<>();
    }
    
    public int ping(int t) 
    {
        q.add(t);
        while (!q.isEmpty() && q.peek() < t - 3000)
        {
            q.poll(); 
        }
        
        return q.size();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        RecentCounter count = null;
        int a = scan.nextInt();
        for(int i=0; i<a; i++)
        {
            String req =scan.nextLine();
            if(req.equals("RecentCounter"))
            {
                count = new RecentCounter();
                System.out.print("null");
            }
            else if(req.equals("ping"))
            {
                int time = scan.nextInt();
                int ans = count.ping(time);
                System.out.print(ans);
            }
        }
    }
}
