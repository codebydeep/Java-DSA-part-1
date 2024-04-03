public class OrderAagnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -4, 0 , 2, 3, 15, 16, 22, 45};
        // int[] arr = {45, 22, 16, 15, 3, 2, 0, -4, -18};
        int target = 16;
        int ans = OrderAagnosticBinarySearch(arr,target);
        System.out.println(ans);
    }
    static int OrderAagnosticBinarySearch(int[] num, int element){
        int start = 0;
        int end = num.length - 1;
        // find whether the Array is Sorted in Ascending or Descending Order.
        boolean isAsc = num[start] < num[end];

        while (start<=end){
            int mid = start + (end - start)/2;
            if (num[mid] == element){
                return mid;
            }
            if (isAsc){
                if (element < num[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
