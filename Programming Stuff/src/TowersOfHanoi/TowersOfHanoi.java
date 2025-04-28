package TowersOfHanoi;
public class TowersOfHanoi {

    public static int totalMoves = 0;
    public static int towerofhanoi(int disc, char start, char goal, char aux) {
        if (disc == 0){
            System.out.println("No discs to move");
            totalMoves = 0;
        } else if (disc == 1){
            System.out.println("Move disc 1 from " + start + " to " + goal);
            totalMoves = 1;
        } else {
            towerofhanoi(disc - 1, start, aux, goal);
            totalMoves++;
            System.out.println("Move disc " + disc + " from " + start + " to " + goal);
            towerofhanoi(disc - 1, aux, goal, start);
            totalMoves++;
        }
        return totalMoves;
    }

    public static void main(String[] args) {
        int results = towerofhanoi(4, 'A', 'C', 'B');
        System.out.println(results);
        //Time complexity: O(2N), There are two possibilities for every disk.
        // Therefore, 2 * 2 * 2 * . . . * 2(N times) is 2N
    }
}