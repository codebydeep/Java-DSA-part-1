import static java.util.Collections.swap;
import java.util.Arrays;
public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr = {1, 3, 23, 9, 18};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            // swap function
           // swap( arr , start , end);
            start++;
            end--;
        }
    }
}
