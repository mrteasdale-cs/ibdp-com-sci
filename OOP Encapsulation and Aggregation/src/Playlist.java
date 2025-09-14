public class Playlist {
    public Playlist() {
        // Create individual song nodes
        SongNode song1 = new SongNode("Shape of You");
        SongNode song2 = new SongNode("Blinding Lights");
        SongNode song3 = new SongNode("Highway to Hell");
        SongNode song4 = new SongNode("Save Me");

        // Link them together (a 'linked list')
        song1.next = song2;
        song2.next = song3;
        song3.next = song4;
        song4.next = song1; // ← CIRCULAR LIST: Last song points back to first!

        // Play songs in a loop (be careful - this could run forever!)
        SongNode currentSong = song1;
        System.out.println("🔄 Circular Playlist (playing 8 songs):");

        for (int i = 0; i < 8; i++) { // Limit to 8 to avoid infinite loop
            System.out.println("♪ Now playing: " + currentSong.songTitle);
            currentSong = currentSong.next; // Move to next song
        }

        System.out.println("loops back to the beginning and plays them over again!");
    }
}

