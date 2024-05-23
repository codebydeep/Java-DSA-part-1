public class StringFormatting {
    public static void main(String[] args) {
        // Lets suppose , we have a number like :
        float a = 453.1274f;
        System.out.printf("Formatted number is %.2f" ,a); // %.2f rounding off the digit upto two decimal places.
        System.out.printf("Pie : %.3f", Math.PI);  // %.3f rounding off the digit upto three decimal places.
        System.out.printf("Hello my name is %s ans I am %s","Kunal", "Coolt");
    }
}
