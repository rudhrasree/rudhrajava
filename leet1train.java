import java.util.Arrays;
import java.util.Scanner;
class leet1train 
{
    public static int train(int[] arr, int[] dep, int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat = 1;
        int maxPlat = 1;

        int i = 1;
        int j = 0;

        while(i < n && j < n)
        {
            if(arr[i] <= dep[j])
            {
                plat++;
                i++;
            }
            else
            {
                plat--;
                j++;
            }
            
            if(plat > maxPlat)
            {
                maxPlat = plat;
            }
        }

        return maxPlat;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arraival = new int[a];
        int[] depature = new int[a];
        for(int i=0; i<a; i++)
        {
            arraival[i] = scan.nextInt();
        }
        for(int i=0; i<a; i++)
        {
            depature[i]= scan.nextInt();
        }
        int ans= train(arraival,depature,a);
        System.out.print("Minimum no of platforms used is "+ans);
    }
}