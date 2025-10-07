public class ExceptionHandling2 {
    public ExceptionHandling2() {
        try {
            String[] words = {"hello"};
            String index = "Four";
            int indexInt = Integer.parseInt(index);
            System.out.println(words[indexInt]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such index.");
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
}
