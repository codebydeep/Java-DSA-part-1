import java.sql.SQLOutput;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String d = "here";
        while (true){
            System.out.print("Player 1 turns : ");
            String a = in.next();
            System.out.print("Player 2 turns : ");
            String b = in.next();
            System.out.print("Player 3 turns : ");
            String c = in.next();
            if ((a == "rock" && b == "paper") && c == "scissor"){
                if ((a == "rock" && b == "paper") && c == "scissor"){
                     d = "Player 3 Wins ";
                }
                if (a == "paper" && b == "rock" && c == "scissor"){
                    d = "Player 2 Wins ";
                }
                if (a == "rock" && b == "scissor" && c == "paper"){
                    d = "Player 1 Wins ";
                }
                if (a == "paper" && b == "scissor" && c == "rock"){
                    d = "Player 3 Wins ";
                }
            }
            else if (a == "X" || b == "X" || c == "X"){
                break;
            }
            else {
                System.out.println("Give a Valid turns ");
            }
            System.out.println(d);
        }
    }
}
