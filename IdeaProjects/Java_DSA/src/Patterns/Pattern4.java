package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        pattern4(n);
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
