import java.util.Scanner;
class neo8{
    public static void main(String args[]){
        int l,b;
        float ar;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        if(l>0&&b>0){
        ar=l*b;
        System.out.println(ar);
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
}