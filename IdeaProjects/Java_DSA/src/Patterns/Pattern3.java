package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        pattern3(n);
        patternn3(n);
    }
    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Another's Approach
    static void patternn3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
