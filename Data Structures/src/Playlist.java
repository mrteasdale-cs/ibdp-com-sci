import java.util.LinkedList;
// Playlist class with AGGREGATION
class Playlist {
    private String playlistName;
    private LinkedList<Song> songs; // AGGREGATION: Playlist "has-a" collection of Songs

    public Playlist(String name) {
        this.playlistName = name;
        this.songs = new LinkedList<>();
    }
    // Method to add a song (aggregation in action)
    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        songs.add(newSong);
    }
    // Method to remove first song using removeFirst()
    public Song skipSong() {
        if (!songs.isEmpty()) {
            return songs.removeFirst();
        }
        return null;
    }
    // Get playlist size
    public int getSize() {
        return songs.size();
    }

    // Get currently playing song
    public Song getCurrentSong() {
        if (!songs.isEmpty()) {
            return songs.getFirst();
        }
        return null;
    }

    // Display all songs
    public void displayPlaylist() {
        System.out.println("🎶 " + playlistName + ":");
        for (Song song : songs) {
            System.out.println("♪ " + song); // Uses Song's toString method
        }
    }
}