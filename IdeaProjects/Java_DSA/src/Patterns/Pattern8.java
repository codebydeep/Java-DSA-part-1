package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        pattern8(n);
    }
    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for (int s = n-i; s >= 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int s = 0; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
