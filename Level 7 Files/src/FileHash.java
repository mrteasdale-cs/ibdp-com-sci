import java.nio.file.*;
import java.security.*;
import java.util.HexFormat;

public class FileHash {
    public static void main(String[] args) throws Exception {
        // 1) Pick a file to hash
        Path path = Paths.get("Reading.csv"); // ensure this file exists

        // 2) Read bytes and hash with SHA-256
        byte[] data = Files.readAllBytes(path);
        MessageDigest md = MessageDigest.getInstance("SHA-256"); // SHA-256 digest [2]
        byte[] digest = md.digest(data);

        // 3) Print hex
        String hex = HexFormat.of().formatHex(digest);
        System.out.println("SHA-256: " + hex);
    }
}