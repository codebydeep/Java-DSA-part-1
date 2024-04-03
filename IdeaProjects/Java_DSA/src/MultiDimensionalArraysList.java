import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArraysList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax of MultiDimensional ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        // printing the multidimensional arraylist
        System.out.println(list);
    }
}
