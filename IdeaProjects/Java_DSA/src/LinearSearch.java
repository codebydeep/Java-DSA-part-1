public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 23, 12, 56, 87};
        int target = 12;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    // Search in the Array : return the index , if item found.
    // Otherwise, if item not found return -1.
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        // This line will execute if none of the return statements above have executued.
        // Hence the Target not found.
        return -1;
    }
}
