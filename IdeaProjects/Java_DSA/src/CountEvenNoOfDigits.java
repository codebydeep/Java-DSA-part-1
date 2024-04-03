public class CountEvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {23, 4, 87, 1476, 476, 45};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] num){
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (even(num[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigits = digits(num);
        if (numberofdigits%2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
