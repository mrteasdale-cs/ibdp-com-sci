public class PrintStatmentDebug {

    public PrintStatmentDebug() {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            x += i;
            System.out.println("i: " + i + ", x: " + x);
        }
        System.out.println(x);
    }

}
