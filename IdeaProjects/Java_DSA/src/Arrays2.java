import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printing output values of array which we have taken input values
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        // We can also used enhanced for loop for printing arrays
        for (int num : arr){
            System.out.print(num +" ");
        }
        // If we try to get output index not present, it gives us error
        // int[] arr2 = {3, 5, 8, 45, 23};
        // System.out.println(arr2[5]);
    }
}
