
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet wordSet = new WordSet();
        
        UserInterface userInterface = new UserInterface(scanner, wordSet);
        userInterface.start();
        
    }

}
