public class Main {
    public static void main(String[] args) {

        Playlist pl = new Playlist("Myran's Playlist");
        pl.addSong("Baby", "Justin Bieber");
        pl.addSong("Mac", "Mac Force 1");

        pl.displayPlaylist();

        System.out.println("Size of Playlist: " + pl.getSize());
        System.out.println("Current Song:");
        System.out.println(pl.getCurrentSong());

        System.out.println("Skipping song " + pl.skipSong());
        System.out.println("\nCurrent Song:");
        System.out.println(pl.getCurrentSong());
        /*int[] arr = {6,5,8,9,3,2,1,0};
        Stacks stack = new Stacks(arr);

        stack.printStack();
        stack.pushToStack(15);
        stack.pushToStack(54);
        stack.pushToStack(87);
        stack.pushToStack(50);
        stack.printStack();*/

    }
}