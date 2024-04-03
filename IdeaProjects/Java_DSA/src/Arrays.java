public class Arrays {
    public static void main(String[] args) {
        // Why we need Arrays
        // Q: store a roll no:
        // int rollno = 19;
        // Stores a person's name
        // String name = "Deepansh";

        // Why we need Arrays
        // For Storing 500 roll nos
        /* An Array is a collection of same type of DataTypes or elements/objects
         */
        // syntax of an Array:
        // datatype[] variable_name = new datatype[size];
        /*
        Let us stores a 5 roll nos
         */
        int[] rnos = new int[5]; //here 5 is the size of an array
        // or we can also write Arrays in this way also:
        int[] rnos2 = {3, 4, 22, 56, 15};

        // declaration of Array:
        int[] ros; // Actually here object is created in the Heap memory

        // initialisation
        ros = new int[5];

        // Indices of Array
        int[] arr = {4, 6, 87, 32, 44};
        // System.out.println(arr[0]);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        // arr.length is the method to find the size of an array

        /*
        Let us know more about Arrays
         */
        int[] arr2;
        arr2 = new int[5];
        System.out.println(arr2[1]); // All the Integer arrays by default has the value 0;

        // For Strings, by default it gives null. "null" is a literal in java;
        String[] ar = new String[4];
        System.out.println(ar[0]); // It gives null
    }
}
