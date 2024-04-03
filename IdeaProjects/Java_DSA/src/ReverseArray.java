import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ros = new int[5];
        for (int i = 0; i < ros.length; i++) {
            ros[i] = in.nextInt();
        }
       /* for (int i = 4; i <= 0 ; i--) {
            System.out.print(ros[i] +" ");
        }
        */
        int[] arr = {4, 56, 67,45, 22};
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
