public class MaxElement {
    public static void main(String[] args) {
        int [] arr = {1, 3, 23, 9, 18, 89};
        System.out.println(Max(arr));
    }
    static int Max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
