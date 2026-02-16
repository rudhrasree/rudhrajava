import java.util.Scanner;
class neo10{
 public static void main(String[] args) {
     int x,y,z;
     Scanner in =new Scanner(System.in);
     x=in.nextInt();
     y=in.nextInt();
     z=in.nextInt();
     if(x>0&&y>0&&z>0){
  System.out.println(-x + y * z);
     }
     else{
         System.out.println("Invalid");
     }
 }
}