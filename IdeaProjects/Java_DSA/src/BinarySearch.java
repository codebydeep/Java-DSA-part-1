import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3, 4, 6, 8, 98, 323, 645};
        int target = in.nextInt();
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] num , int element){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            // int mid = ( start + end )/ 2; //might be possible to exceeds the Integer limit.
            // better way to find Mid.
            int mid = start + (end - start)/2;
            if (element < num[mid]){
                end = mid-1;
            } else if(element > num[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
