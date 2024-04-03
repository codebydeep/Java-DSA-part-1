import java.util.Arrays;
import java.util.SortedMap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 13, 17};
        InSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InSort(int[] num){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }

    // Insertion Sort
    static void insort(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j > 0; j++) {
                if (num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                 }
                else {
                    break;
                }
            }
        }
    }
}
