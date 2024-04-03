public class MinimumElem {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 45, 23, 19, 54};
        int ans = Min(arr);
        System.out.println(ans);
    }
    static int Min(int[] arr ){
        // Assuming first element as minimum element.
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
