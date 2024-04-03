import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Other way to print Array
        // System.out.println(Arrays.toString(arr));

        // Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] +" ");
        }
            System.out.print(Arrays.toString(str));

        // modify
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
