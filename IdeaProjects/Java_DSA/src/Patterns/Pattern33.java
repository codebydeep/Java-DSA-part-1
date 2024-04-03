package Patterns;


public class Pattern33 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'a';
        pattern33(n,ch);
        // npatt(n);
    }
    static void pattern33(int n , char ch){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0){
                    System.out.print(Character.toUpperCase(ch)+" ");
                }else {
                    System.out.print(ch + " ");
                }
                ch++;
            }
            System.out.println();
        }
    }
    static void npatt(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
