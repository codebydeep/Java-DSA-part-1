public class MaxEleminRange {
    public static void main(String[] args) {
        int[] arr = {3, 6, 89, 67, 23};
        int ans = Maxi(arr);
        System.out.println(ans);
    }
    static int Maxi(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < 3; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
