import java.util.Scanner;

public class sum_of_even_array_elements {
    public static void main(String args[])

    {
        Scanner o = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + i + " ");
            arr[i] = o.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(arr[i]%2==0){

                sum = sum+arr[i];
            }
            
        }
        System.out.println(sum);
    }
}
