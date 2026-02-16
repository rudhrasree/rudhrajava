import java.util.Scanner;
class neo3{
    public static void main (String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
        int a=(int)ch;
        float b=(float)ch;
        byte c=(byte)ch;
        short d=(short)ch;
        System.out.println("int:"+a);
        System.out.println("float:"+b);
        System.out.println("byte:"+c);
        System.out.println("short:"+d);
    }
    else {
        System.out.println("Invalid");
    }
    
    }   
}