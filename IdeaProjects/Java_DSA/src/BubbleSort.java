import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2,3, 4,5,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] num){
        boolean swapped;
        // Run the steps n-1 times
        for (int i = 0; i < num.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index.
            for (int j = 1; j < num.length - i; j++) {
                // Swap if the Item is smaller then previous Item.
                if (num[j] < num[j-1]){
                    // swap
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                    swapped = true;
                }
            }

            // If you did not Swap for a particular value of i, it means the Array is sorted , Hence stop the Program.
          if (!swapped){ // !false = true
              break;
          }
        }
    }
}
