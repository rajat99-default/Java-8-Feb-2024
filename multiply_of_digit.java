import java.util.Scanner;

public class multiply_of_digit {
    public static void main(String[] args) {
        Scanner o  =new Scanner(System.in);
        System.out.print("Enter the number of digits you will enter = ");

        int a = o.nextInt();
        int arr[] = new int[a];
        int b = 1;

        for(int i = 0; i < arr.length; ++i) {
            System.out.print("Enter number = " + i + " = ");
            arr[i] = o.nextInt();
            b = b * arr[i];
        }
        System.out.print(b);    

        // for(int i = 0; i < arr.length; ++i) {
        //     b = b * 10 + arr[i];
        // }
    }
    
}
