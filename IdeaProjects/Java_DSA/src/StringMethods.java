import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray())); // Converts into a character array.
        System.out.println(name.toLowerCase()); // Converts into lower case alphabets.
        System.out.println(name.indexOf('a')); // Gives index of a letter.
        System.out.println("     Kunal".strip()); // Removes the spaces from the String.
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
