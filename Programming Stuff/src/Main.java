import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {7,4,9,8,1,3,2,5,10,6};
        int[] sortedArr = sortArr(arr);
        System.out.println("The sorted array");
        System.out.println("The sorted array" + Arrays.toString(arr));
        for(int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
    //Given an array of integers, perform a bubble sort to arrange
    //them into smallest to largest
    //[7,4,9,8,1,3,2,5,10,6]
    //you should return the sorted array
    public static int[] sortArr(int[] arr){
        int arrLength = arr.length;
        boolean swapped = false;
        // creeate new sorted array
        //int[] sortedArr = new int[arrLength];
        //for loop
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                swapped = true;
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }






    public static int reverseInteger(int x) {
        int result = 0;

        while (x != 0) {
            result = (result * 10) + x % 10;
            System.out.println(result);
            x = x / 10;
            System.out.println(x);
        }

        return result;
    }


}
