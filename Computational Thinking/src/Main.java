import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int p1Wins = 0, p2Wins = 0;
        int p1Losses = 0, p2Losses = 0;
        int draws = 0;

        for (int i = 0; i < 50; i++){

            // Random hands in 1..3 inclusive
            int hand1 = 1 + r.nextInt(3); // 0..2 -> 1..3 [8]
            int hand2 = 1 + r.nextInt(3); // 0..2 -> 1..3 [8]

            String p1 = toName(hand1);
            String p2 = toName(hand2);
            System.out.println("Player1: " + p1 + " (" + hand1 + ")");
            System.out.println("Player2: " + p2 + " (" + hand2 + ")");

            // Decide winner using only if/else
            if (hand1 == hand2) {
                System.out.println("Draw");
                draws++;
            } else if (hand1 == 1 && hand2 == 2) {  // Scissors cut Paper
                System.out.println("Player1 wins");
                p1Wins++;
                p2Losses++;
            } else if (hand1 == 2 && hand2 == 3) {  // Paper wraps Stone
                System.out.println("Player1 wins");
                p1Wins++;
                p2Losses++;
            } else if (hand1 == 3 && hand2 == 1) {  // Stone smashes Scissors
                System.out.println("Player1 wins");
                p1Wins++;
                p2Losses++;
            } else {
                System.out.println("Player2 wins");
                p2Wins++;
                p1Losses++;
            }
        }
        System.out.println("Analysis");
        System.out.println("P1 Wins: " + p1Wins);
        System.out.println("P1 Losses: " + p1Losses);
        System.out.println("P2 Wins: " + p2Wins);
        System.out.println("P2 Wins: " + p2Losses);
        System.out.println("Draws: " + draws);
    }

    static String toName(int h) {
        if (h == 1) return "Scissors";
        else if (h == 2) return "Paper";
        else if (h == 3) return "Stone";
        else return "Unknown";
    }
}