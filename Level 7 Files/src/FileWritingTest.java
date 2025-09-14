import java.io.*;
public class FileWritingTest {
    public FileWritingTest() throws IOException {
        //create a new FileWriter object
        FileWriter fw = new FileWriter("Level 7 Files\\Test.csv", true);
        for (int i = 0; i < 10; i++) {
            fw.write(i + "\n"); //write numbers 0-9 into the file
        }
        //writing another line to the file
        fw.write("testing\n"); // \n adds a new line!
        //close the file (important in Java to release the resources from memory)
        fw.close();

        System.out.println("Wrote to file");//helpful output message once all in done
    }//end constructor
}//end class

