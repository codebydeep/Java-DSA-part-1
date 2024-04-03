public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            //System.out.println(ch); Print Alphabets in new line.
            series += ch;
            /*
                       Actually here, We created a new Object each time , when a new character is added in a string series, this results in a so much loss of memory.
                       And will have No reference variable for the initial String series.
             */
            /*
            If the only one Object is created, And the changes can be made again and again to the Object. By the help of StringBuilders.
             */
        }
        System.out.println(series);//Print Alphabets in a single line.
    }
}
