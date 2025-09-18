import java.util.Random;
import java.util.Arrays;
public class Stock {

    public Stock(){
        int[] STOCK = new Random().ints(100, 1, 101).toArray();
        System.out.println(Arrays.toString(STOCK));

        int count = 0, total = 0, average = 0;

        for (int i = 0; i < STOCK.length; i++){
            if (STOCK[i] > 0) {
                count ++;
                total += STOCK[i];
                System.out.println("Curr total:" + total + " " + count);
            }//end if
        }//end for

        if (count != 0) {
            average = total / count;
            System.out.println("Average Stock : "+average);
        } else {
            System.out.println("No non-zero values.");
        }

    }//end constructor
}//end class
