public class RLEncoder {
    //instance vairbles
    String in;
    String out;
    int counter;
    //compress method
    public String compress(String in) {
        String out = "";
        int counter = 1;
        int len = in.length();
        for (int i = 0; i < len-1; i++) {
            if (in.charAt(i) == in.charAt(i + 1)) {
                counter++;
            } else {
                out += Integer.toString(counter) + in.charAt(i);
                counter = 1;
            }
        }
        out += Integer.toString(counter) + in.charAt(len - 1);
        return out;
    }

    //decompress method

    //askUser
}