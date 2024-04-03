public class MultiDimenArrays {
    public static void main(String[] args) {
        // This is Multi Dimensional Array
        /*
          1 2 3
          4 5 6
          7 8 9
         */
        // initialisation of 2D Arrays
        int[] [] arr = new int[3][3]; // 3 Rows & 3 Columns

        // Or directly
        int [] [] ros = {
                {1, 2, 3}, // 0th Index
                {4, 5, 6}, // 1st Index
                {7, 8, 9}  // 2nd Index
                 };
        // Index's 0th , 1st, 2nd
        // System.out.println(ros[0][1]); // It will be print Row
    }
}
