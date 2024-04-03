public class FrequencyOfNos {
    public static void main(String[] args) {
        int[] arr = {4,63,8,6,78,8,3};
        int target = 8;
        int s =0;
        int e=arr.length;
        int cnt =0;
        int m=0;
        while(s<e){
            int mid = s+(e-s)/2;
            if (arr[mid] < target){
                s = mid+1;
            }
            if (arr[mid] > target){
                e = mid-1;
            }
            else{
                 m=mid;
            }
        }

            for (int i = 0; i < arr.length; i++) {
                if (arr[m] == target) {
                    cnt++;
                }
            }
        System.out.println(cnt);
    }
}
