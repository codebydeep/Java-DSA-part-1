package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        pattern5(n);
        patternn5(n);
    }
    static void pattern5(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternn5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
