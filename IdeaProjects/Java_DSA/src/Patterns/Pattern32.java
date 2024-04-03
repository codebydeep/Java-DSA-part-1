package Patterns;

public class Pattern32 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        //pattern34(n,ch);
        pattern32(n,ch);
    }
    static void pattern34(int n, char ch){
        for (char i='A';i<='E';i++) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j);
                //ch--;
            }
            System.out.println();
        }
    }

    static void pattern32(int n, char ch){
        for (char i='E';i>='A';i--) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j);
                //ch--;

            }
            System.out.println();
        }
    }
}
