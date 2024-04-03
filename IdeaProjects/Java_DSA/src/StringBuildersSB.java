public class StringBuildersSB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch); // No New Objects can be created again and again here.
        }
        System.out.println(builder.toString());
    }
}
