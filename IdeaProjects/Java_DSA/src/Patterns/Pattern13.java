package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        pattern13(n);
    }
    static void pattern13(int n){
        for (int i = 1; i <= n; i++) {
            for (int s = n-i; s >= 0 ; s--) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2*i-1; j++){
                if (i==1){
                    System.out.print(" ");
                }
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
