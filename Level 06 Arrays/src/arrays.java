import java.util.Arrays;
public class arrays {
    
    public arrays() {

        //datatype[] <identifier> = new datatype[N];
        //remember, Java is a statically typed language
        int[] nums = new int[5];
        nums[0] = 19;
        nums[1] = 14;
        nums[4] = 99;
        System.out.println(nums[1]);
        int[][] nums2 = new int[10][10];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2.length; i++) {
                nums2[i][j] = 1 + 2 * i;
            }
        }
            for (int i = 0; i < nums2.length; i++) {
                System.out.print(nums2[i]);
            }
            System.out.println(Arrays.toString(nums2));

            double[] price = {1.99, 4.95, 2.99, 14.95, 28.95};
            int[] quantity = {56, 38, 42, 20, 17};
            double[] revenue = new double[5];

            for (int i = 0; i < quantity.length; i++) {
                revenue[i] = Math.round((price[i] * quantity[i]) * 100);
                revenue[i] = revenue[i] / 100;
                break;
            }

            System.out.print(Arrays.toString(revenue));
            System.out.println("\nPrice     | Qty   | Revenue  ");
            for (int p = 0; p < revenue.length; p++) {
                System.out.println("$" + price[p] + "    | " + quantity[p] + " | " + "$" + revenue[p]);
            }

        }
    }