import java.util.Scanner;

public class Special_number {
    
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter the number of digits you will enter = ");

        int a = o.nextInt();
        int arr[] = new int[a];
        int b = 0;

        for(int i = 0; i < arr.length; ++i) {
            System.out.print("Enter number = " + i + " = ");
            arr[i] = o.nextInt();
        }

        for(int i = 0; i < arr.length; ++i) {
            b = b * 10 + arr[i];
        }
        
        int sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            int factorial = 1;
            for(int j = 1; j <= arr[i]; ++j) {
                factorial = factorial* j;
            }
            sum = sum + factorial;
        }
        
        if(b == sum) {
            System.out.print("This is a special number ");
        } else {
            System.out.print("NO");
        }

        o.close();
    }
}
