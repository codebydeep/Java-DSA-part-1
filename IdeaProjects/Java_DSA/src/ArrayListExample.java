import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>();
        // Use of ArrayList
        /*
        In Java, If the Array will not having the fixed size, And Input the many number of elements we have to use ArrayList.
         */
        // In C++, Vectors are Used

        // Important Point
        // We do not passes Primitives in ArrayList , We only used a Wrapper classes(We will discussed in OOPs).
         list.add(67);
         list.add(234);
        list.add(654);
        list.add(23);
        list.add(78);
        list.add(69);
        // Printing the list
        System.out.println(list);
        // Gives output True or False , if the Element is present or not
        System.out.println(list.contains(653));
        // This changes 0th Index to 99
        list.set(0, 99);
        // It Removes the Index no 2
        list.remove(2);

        System.out.println(list);
    }
}
