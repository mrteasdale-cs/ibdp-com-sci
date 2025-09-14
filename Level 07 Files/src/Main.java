import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //new FileWritingTest();
            new PlayWithFiles();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}