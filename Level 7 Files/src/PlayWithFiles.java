import java.io.*;

public class PlayWithFiles {
    public PlayWithFiles() throws IOException {
        //connect Java to file in Windows system
        FileReader fr = new FileReader("Reading.csv");
        //connect a reader to the file
        BufferedReader br = new BufferedReader(fr);
        //gets first line of the bufferedreader contents and place into
        //a string variable called line. if this is not null the while
        //loop will continue
        String line; //initialise line first
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.print("Firstname: " + data[0] + "\n");
            System.out.print("Surname: " + data[1] + "\n");
            System.out.print("Score: " + data[2]+"%\n\n");
        }
        //close the reader
        br.close();
    }
}

