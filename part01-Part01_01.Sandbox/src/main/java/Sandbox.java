
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Playlist list = new Playlist();
        
        list.addSong("Sorateiden kuningas");
        list.addSong("euvo, maanteiden kuningas");
        list.printSongs();
    }

}
