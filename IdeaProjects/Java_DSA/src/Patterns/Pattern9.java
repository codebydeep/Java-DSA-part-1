package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        pattern8(n);
    }
    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for (int s = n-i; s >= 0; s--) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
