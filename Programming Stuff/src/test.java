import java.io.*;

public class test {
        public static void main(String[] args) throws IOException {
            FileReader fr = new FileReader("hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String[] tempstringarray = line.split(",");

            int total = 0;
            int[] intarr = new int[tempstringarray.length];
            for (int i = 0; i < tempstringarray.length; i++) {
                intarr[i] = Integer.parseInt(tempstringarray[i]);
                total = total + intarr[i];
            }

            System.out.println(total);
            br.close();
            fr.close();
    }
}
