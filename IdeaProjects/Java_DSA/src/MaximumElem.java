import java.util.Scanner;

public class MaximumElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 7, 32, 21, 3};

            int max = arr[0];
            for (int i = 0; i < 5; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
