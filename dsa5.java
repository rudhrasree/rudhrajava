import java.util.Scanner;

class SortStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = scan.nextInt();
        scan.nextLine(); 

        String[] arr = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) 
                {   
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nStrings in alphabetical order:");
        for (int i = 0; i < arr.length; i++) 
        {
             System.out.println(arr[i]);
        }
    }
}
