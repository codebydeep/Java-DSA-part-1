import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3, 4, 5, 12};
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99; // This will also changed the Original nums array in the memory.
    }
}
