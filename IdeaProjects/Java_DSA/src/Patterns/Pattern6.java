package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        pattern6(n);
    }
    static void pattern6(int n){
            for (int i = 1; i <= n; i++) {
                for (int s = n-i; s > 0; s--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
