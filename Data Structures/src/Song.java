// Song class with ENCAPSULATION
class Song {
    // TODO: Add private fields for title and artist
    private String title;
    private String artist;

    // Constructor
    public Song(String title, String artist) {
        // TODO: Initialise the private fields
        this.title = title;
        this.artist = artist;
    }

    // TODO: Create public getter methods (encapsulation)
    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    // Override toString for easy display
    public String toString() {
        return this.title + " by " + this.artist;
    }
}