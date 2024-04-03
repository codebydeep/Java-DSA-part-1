public class Strings {
    public static void main(String[] args) {
        // strings & StringBuilders
        // syntax of a String
        String name = "Kunal"; // declaration of String
        // data_type variable_name/refence variable = Object created in heap.

       // String a = "Kunal"; // This will keep as a separate Object.
       // a = "Kushwaha"; // We were only Creating a new Object here. The "Kunal" now goes in Garbage Collection.
       // System.out.println(a);

        // String Comparator (==)
       // String a = "Kunal";
       // String b = "Kunal";
       // System.out.println(a==b); // It gives True , bcoz both the Reference variables will be pointing to the same object.

        // But here , In this Case :
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1==name2); // It gives False , bcoz here the New objects are created in the memory for the both the Reference Variables.

        // .equals() Method;
        System.out.println(name1.equals(name2)); // It gives True, bcoz Its only comparing the Values of the Strings.

        // To access the characters of a String, we use charAt() method.
        System.out.println(name1.charAt(0));

        for (int i = 0; i < 5; i++) {
            System.out.print(name2.charAt(i)+" ");
        }
    }
}
