import java.io.*;
import java.util.Arrays;

public class FileExample {
    public void readFile(String fileName){
        // Connect to the fileReader and add to a bufferedReader
        String line = "";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            //read the line
            line = br.readLine();

            int[] arr = addToArray(line);
            printArray(arr);

        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }

    public void writeFile(String fileName){
        try{
            int num = 10;
            int fib = 0;
            FileWriter fw = new FileWriter(fileName);

            int[] data = fib(29);

            for (int i : data){
                fw.write(i + "\n");
            }

            fw.write("TESTING");
            fw.close();
            System.out.println("Success!!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + fileName);
        }
    }

    public int[] addToArray(String line) {
        String[] tempArr = line.split(",");
        int[] arr = new int[tempArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tempArr[i]);
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("Number of items: " + arr.length);
    }

    public int[] fib(int n){
        int[] fibSequence = new int[n];
        fibSequence[0] = 0;
        fibSequence[1] = 1;
        for (int i = 2; i < n; i++){
            fibSequence[i] = fibSequence[i-1] + fibSequence[i-2];
        }
        return fibSequence;
    }
}
