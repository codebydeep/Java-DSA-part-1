import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3);   // 100
        System.out.println((char)'a' + 3); // d
        System.out.println("a" + 1);   //a1
        // This is same as after a few "a" + 1.
        // integer will be converted to Integer(wrapper class) that will call tostring() method.
        /*
          When an integer is added to String, it is converted to its wrapper class Integer.
        */

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

        // But , here
        //System.out.println(new Integer(56) + new ArrayList<>()); // Gives Error.
        // The Operator + in Java is always defined for Primitives And any one of these values is Strings.

        String ans = new Integer(56) + " " + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + "b");
    }
}
