import java.io.*;

public class ReadingFiles {

        public static void main(String[] args) throws IOException {
            FileReader fr = new FileReader("hello.txt");
            BufferedReader br = new BufferedReader(fr);
            //file contents: 23,45,56,93,23,35
            String line = br.readLine();

            String[] tempstringarray = line.split(",");
            int[] intarr = new int[tempstringarray.length];
            int total = 0;
            for (int i = 0; i < tempstringarray.length; i++) {
                intarr[i] = Integer.parseInt(tempstringarray[i]);
                total = total + intarr[i];
            }
            System.out.println(total);
            //output: 275
            br.close();
            fr.close();
        }


}

