import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
