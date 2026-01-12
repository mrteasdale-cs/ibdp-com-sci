public class Main {
    public static void main(String[] args) {
        System.out.println("==Run-Length Encoder==");

        RLEncoder encoder = new RLEncoder();
        System.out.println(encoder.compress("bbbwwbb"));

        String a = "5";
        System.out.println(a);
    }
}

