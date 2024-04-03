import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] [] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i] [j] = in.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }
}
