import java.util.Scanner;
class neo2{
    public static void main(String[] args) {
    	
    	int number1, number2, result;
    	Scanner sc=new Scanner(System.in);
    	number1=sc.nextInt();
    	number2=sc.nextInt();
    	result = number1 | number2;
    	System.out.println(result);
    }
}